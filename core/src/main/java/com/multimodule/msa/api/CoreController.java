package com.multimodule.msa.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/core")
public class CoreController {

    @GetMapping("/ping")
    public String test() {
        return "ping";
    }
}
