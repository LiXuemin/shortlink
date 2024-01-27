package com.lxm.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxm.shortlink.admin.dao.entity.UserDO;
import com.lxm.shortlink.admin.dao.mapper.UserMapper;
import com.lxm.shortlink.admin.dto.resp.UserRespDTO;
import com.lxm.shortlink.admin.service.UserService;
import com.lxm.shortlink.admin.util.BeanConverter;
import lombok.RequiredArgsConstructor;
import org.redisson.api.RBloomFilter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lixuemin
 * @description: user service impl
 * @date 2024-01-27
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    private final BeanConverter beanConverter;
    private final RBloomFilter<String> userRegisterCachePenetrationBloomFilter;

    @Override
    public UserRespDTO getUserByUsername(String username) {
        final LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);
        final UserDO userDO = baseMapper.selectOne(queryWrapper);
        return beanConverter.userDO2UserRespDTO(userDO);
    }

    @Override
    public Boolean hasUserName(String username) {
        return userRegisterCachePenetrationBloomFilter.contains(username);
    }

    @Override
    public Boolean initBloomFilter() {
        final List<UserDO> userDOList = baseMapper.selectList(new QueryWrapper<>());
        userDOList.stream().forEach(userDO -> userRegisterCachePenetrationBloomFilter.add(userDO.getUsername()));
        return true;
    }
}
