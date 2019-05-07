package com.himalaya.app.user.mapper;

import com.himalaya.app.user.domain.SysFuncDO;

public interface SysFuncMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysFuncDO record);

    int insertSelective(SysFuncDO record);

    SysFuncDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysFuncDO record);

    int updateByPrimaryKey(SysFuncDO record);
}