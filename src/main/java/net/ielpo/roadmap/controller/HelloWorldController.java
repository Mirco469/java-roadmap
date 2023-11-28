package net.ielpo.roadmap.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.ielpo.roadmap.dto.HelloWorldResponseDto;
import net.ielpo.roadmap.exception.CustomRuntimeException;
import net.ielpo.roadmap.exception.UnsupportedParameterException;
import net.ielpo.roadmap.factory.ResponseFactory;

/**
 * @author Alberto Ielpo
 */
@Component
@RestController
@RequestMapping(value = "hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping(value = "{idPath}")
    public ResponseEntity<String> getHello(@RequestParam(value = "id") String id,
            @PathVariable(value = "idPath") String idPath) throws IOException, UnsupportedParameterException {
        logger.info("this is an id: {} - idPath: {}", id, idPath);

        if ("pluto".equalsIgnoreCase(idPath)) {
            throw new UnsupportedParameterException("pippo is not supported");
        }

        if ("paperino".equalsIgnoreCase(idPath)) {
            throw new CustomRuntimeException("paperino is not supported");
        }

        /** manually use fasterxml... */
        String simulatedBody = "{\"value\": \"this is my value\"}";
        HelloWorldResponseDto dto = this.objectMapper.readValue(simulatedBody.getBytes(), HelloWorldResponseDto.class);
        logger.info("{}", dto);

        HelloWorldResponseDto responseDto = new HelloWorldResponseDto("hello world");

        // this cannot be used in a factory
        // ErrorResponseDto errorResponseDto = new ErrorResponseDto("this is an error");

        return ResponseFactory.ok(responseDto);
    }

}
