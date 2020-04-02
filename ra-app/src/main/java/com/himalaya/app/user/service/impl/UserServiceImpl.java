package com.himalaya.app.user.service.impl;

import org.springframework.stereotype.Service;

import com.himalaya.app.common.service.AbstractBaseService;
import com.himalaya.app.user.domain.UserDO;
import com.himalaya.app.user.mapper.UserMapper;
import com.himalaya.app.user.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractBaseService<UserMapper, UserDO, Long> implements UserService{

    @Override
    public <T> List<UserDO> queryByCondition(T condition) {
        return null;
    }
}
