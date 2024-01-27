package com.lxm.shortlink.admin.util;

import com.lxm.shortlink.admin.dao.entity.UserDO;
import com.lxm.shortlink.admin.dto.resp.UserRespDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-27T16:18:38+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class BeanConverterImpl implements BeanConverter {

    @Override
    public UserRespDTO userDO2UserRespDTO(UserDO userDO) {
        if ( userDO == null ) {
            return null;
        }

        UserRespDTO userRespDTO = new UserRespDTO();

        userRespDTO.setId( userDO.getId() );
        userRespDTO.setUsername( userDO.getUsername() );
        userRespDTO.setRealName( userDO.getRealName() );
        userRespDTO.setPhone( userDO.getPhone() );
        userRespDTO.setEmail( userDO.getEmail() );

        return userRespDTO;
    }
}
