package net.ielpo.roadmap.factory;

import java.io.IOException;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.ielpo.roadmap.dto.BaseResponseOkDto;

/**
 * @author Alberto Ielpo
 */
public class ResponseFactory {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * This factory serialize a generic T extends BaseResponseOkDto and return a
     * ResponseEntity in JSON format
     * 
     * @param <T>         body
     * @param responseDto
     * @return
     * @throws Exception
     */
    public static <T extends BaseResponseOkDto> ResponseEntity<String> ok(T responseDto) throws IOException {
        String body = ResponseFactory.objectMapper.writeValueAsString(responseDto);
        return new ResponseEntity<String>(body, HttpStatusCode.valueOf(200));
    }

}
