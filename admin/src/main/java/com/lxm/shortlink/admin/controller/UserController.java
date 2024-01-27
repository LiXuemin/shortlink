package com.lxm.shortlink.admin.controller;

import com.lxm.shortlink.admin.common.convention.result.Result;
import com.lxm.shortlink.admin.common.convention.result.Results;
import com.lxm.shortlink.admin.dto.resp.UserRespDTO;
import com.lxm.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }

    /**
     * 根据用户输入的用户名查询该用户名是否已被使用
     *
     * @param username 用户名
     * @return 查询结果，包含该用户名是否已被使用的布尔值
     */
    @GetMapping("/api/shortlink/v1/user/hasUsername")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUserName(username));
    }


}
