package net.ielpo.roadmap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.ielpo.roadmap.config.Const;
import net.ielpo.roadmap.dto.HelloWorldResponseDto;

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

    @GetMapping(value = "{id-path}")
    public ResponseEntity<String> getHello(@RequestParam(value = "id") String id,
            @PathVariable(value = "id-path") String idPath) {
        logger.info("this is an id: {} - idPath: {}", id, idPath);

        HelloWorldResponseDto responseDto = new HelloWorldResponseDto("hello world");
        try {
            String responseBody = this.objectMapper.writeValueAsString(responseDto);
            return new ResponseEntity<String>(responseBody, HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<String>(Const.GENERIC_ERROR, HttpStatusCode.valueOf(500));
        }

    }

}
