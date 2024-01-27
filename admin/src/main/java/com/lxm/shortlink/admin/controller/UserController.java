package com.lxm.shortlink.admin.controller;

import com.lxm.shortlink.admin.dto.resp.UserRespDTO;
import com.lxm.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixuemin
 * @description: user rest api
 * @date 2024-01-27
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }
}
