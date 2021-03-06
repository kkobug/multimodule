package com.multimodule.msa.api.controller;


import com.multimodule.msa.model.User;
import com.multimodule.msa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        return userService.getUser();
    }
}
