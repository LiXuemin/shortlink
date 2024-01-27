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

    UserRespDTO getUserByUsername(String username);
}
