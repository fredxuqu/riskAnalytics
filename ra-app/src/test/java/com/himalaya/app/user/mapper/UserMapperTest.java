package com.himalaya.app.user.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.BaseTestCase;
import com.himalaya.app.user.domain.UserCondition;
import com.himalaya.app.user.domain.UserDO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserMapperTest extends BaseTestCase {
	
	@Autowired
	UserMapper mapper;
	
	@Test
	public void testGetById() {
		UserDO userDO = mapper.selectByID(11l);
		System.out.println(userDO);
	}
	
	@Test
	public void testFindByCondition() {
		UserCondition condition = new UserCondition();
		condition.setRoleId("10");
		condition.setStatus(1);
		List<UserDO> list = mapper.queryByCondition(condition);
		log.info("" + list.size());
		Assert.assertEquals(1, list.size());
	}
}
