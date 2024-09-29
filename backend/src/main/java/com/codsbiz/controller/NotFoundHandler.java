package com.codsbiz.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.IOException;
import java.nio.charset.Charset;

@ControllerAdvice
public class NotFoundHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<String> renderDefaultPage() {
        try {
            Resource resource = new ClassPathResource("public/index.html");
            return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(StreamUtils.copyToString(resource.getInputStream(), Charset.defaultCharset()));
        }
        catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("There was an error completing the action");
        }
    }
}
