package com.himalaya.app.user.mapper;

import com.himalaya.app.user.domain.SysDeptDO;

public interface SysDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDeptDO record);

    int insertSelective(SysDeptDO record);

    SysDeptDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDeptDO record);

    int updateByPrimaryKey(SysDeptDO record);
}