package com.lxm.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxm.shortlink.admin.dao.entity.UserDO;
import com.lxm.shortlink.admin.dao.mapper.UserMapper;
import com.lxm.shortlink.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author lixuemin
 * @description: user service impl
 * @date 2024-01-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
}
