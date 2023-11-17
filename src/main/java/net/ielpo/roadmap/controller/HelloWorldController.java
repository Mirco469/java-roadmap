package net.ielpo.roadmap.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alberto Ielpo
 */
@Component
@RestController
@RequestMapping(value = "hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {

    @GetMapping(value = "")
    public ResponseEntity<String> getHello() {
        String body = "{\"value\": \"helloworld\"}";
        return new ResponseEntity<String>(body, HttpStatusCode.valueOf(200));
    }

}
