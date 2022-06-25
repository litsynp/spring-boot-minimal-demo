package com.litsynp.min.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {

    @GetMapping
    public String getHello() {
        return "Hello!";
    }

    @PostMapping("/{id}")
    public String makeHello(@PathVariable Long id) {
        return "Hello!" + id;
    }
}
