
package com.bancoppel.gitactionsJava2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World Global CICD Template Repo Java 2 Test v1.12.1";
    }
}
