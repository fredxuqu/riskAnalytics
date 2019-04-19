package com.himalaya.app.user.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.BaseTestCase;
import com.himalaya.app.user.domain.UserDO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserMapperTest extends BaseTestCase {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testGetById() {
		UserDO userDO = userMapper.selectByID(11l);
		System.out.println(userDO);
	}
}
