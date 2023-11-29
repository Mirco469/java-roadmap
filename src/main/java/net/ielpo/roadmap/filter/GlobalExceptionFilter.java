package net.ielpo.roadmap.filter;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import net.ielpo.roadmap.dto.BodyStatusDto;
import net.ielpo.roadmap.exception.UnsupportedParameterException;

/**
 * @author Alberto Ielpo
 */
@ControllerAdvice
public class GlobalExceptionFilter extends ResponseEntityExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HttpServletRequest httpServletRequest;

    private BodyStatusDto buildBodyStatus(Exception ex) {
        HttpStatusCode statusCode = HttpStatusCode.valueOf(500);
        Map<String, Object> body = new HashMap<>();

        // {
        // "timestamp": 1701168536818,
        // "status": 500,
        // "error": "Internal Server Error",
        // "path": "/hello-world/pluto"
        // }

        body.put("timestamp", System.currentTimeMillis());

        /** extend it properly... */
        if (ex instanceof UnsupportedParameterException) {
            body.put("error", "This param is not supported");
            statusCode = HttpStatusCode.valueOf(400);
        } else {
            /** runtime exception... */
            body.put("error", "something went wrong!");
        }

        body.put("status", statusCode);
        body.put("path", this.httpServletRequest.getRequestURI());
        return new BodyStatusDto(body, statusCode);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {

        logger.error("--->", ex);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

        BodyStatusDto dto = this.buildBodyStatus(ex);

        return handleExceptionInternal(ex, dto.getBody(), httpHeaders, dto.getStatus(), request);
    }
}
