package com.kk.kk.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping(value = "/abcd")
    public String m1() {
        return "ABCD";
    }

}
