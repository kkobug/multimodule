package com.multimodule.msa.api.auth.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainAuthController {

    @GetMapping("/ping")
    public String test() {
        return "ping";
    }
}
