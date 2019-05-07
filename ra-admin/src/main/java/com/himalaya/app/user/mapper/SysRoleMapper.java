package com.himalaya.app.user.mapper;

import com.himalaya.app.user.domain.SysRoleDO;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDO record);

    int insertSelective(SysRoleDO record);

    SysRoleDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleDO record);

    int updateByPrimaryKey(SysRoleDO record);
}