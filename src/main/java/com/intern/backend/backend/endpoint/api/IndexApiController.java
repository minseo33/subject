package com.intern.backend.backend.endpoint.api;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexApiController {

    @GetMapping("/api")
    public String indexApi() {
        return "index";
    }
}
