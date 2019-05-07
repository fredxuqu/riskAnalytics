package com.himalaya.app.user.service.impl;

import org.springframework.stereotype.Service;

import com.himalaya.app.common.service.AbstractBaseService;
import com.himalaya.app.user.domain.SysUserDO;
import com.himalaya.app.user.mapper.SysUserMapper;
import com.himalaya.app.user.service.SysUserService;

@Service
public class SysUserServiceImpl extends AbstractBaseService<SysUserMapper, SysUserDO, Long> implements SysUserService{

}
