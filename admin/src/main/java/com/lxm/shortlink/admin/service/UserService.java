package com.lxm.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxm.shortlink.admin.dao.entity.UserDO;
import com.lxm.shortlink.admin.dto.resp.UserRespDTO;

/**
 * @author lixuemin
 * @description: user service
 * @date 2024-01-27
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息的响应数据传输对象
     */
    UserRespDTO getUserByUsername(String username);


    /**
     * 判断用户是否存在
     *
     * @param username 用户名
     * @return 如果用户存在则返回true，否则返回false
     */
    Boolean hasUserName(String username);

    Boolean initBloomFilter();
}

