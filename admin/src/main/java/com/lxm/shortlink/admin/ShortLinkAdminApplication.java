package com.lxm.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lixuemin
 * @description: TODO
 * @date 2024-01-27
 */
@SpringBootApplication
@MapperScan("com.lxm.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class, args);
    }
}
