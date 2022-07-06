package com.multimodule.msa.api.user.controller;

import com.multimodule.msa.model.User;
import com.multimodule.msa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainUserController {

    private final UserService userService;

    @GetMapping
    public String getUserNickname(@RequestParam("username") String username) {
        return userService.getUser(username).getNickname();
    }

}
