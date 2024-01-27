package com.lxm.shortlink.admin.util;

import com.lxm.shortlink.admin.dao.entity.UserDO;
import com.lxm.shortlink.admin.dto.resp.UserRespDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author lixuemin
 * @description: TODO
 * @date 2024-01-27
 */
@Mapper(componentModel = "spring")
public interface BeanConverter {

    BeanConverter INSTANCE = Mappers.getMapper(BeanConverter.class);

    UserRespDTO userDO2UserRespDTO(UserDO userDO);
}
