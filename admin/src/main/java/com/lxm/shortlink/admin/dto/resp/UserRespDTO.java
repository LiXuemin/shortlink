package com.lxm.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @author lixuemin
 * @description: return user
 * @date 2024-01-27
 */
@Data
public class UserRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;
}
