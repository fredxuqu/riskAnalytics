package com.himalaya.app.user.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.BaseTestCase;
import com.himalaya.app.user.domain.SysUserCondition;
import com.himalaya.app.user.domain.SysUserDO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserMapperTest extends BaseTestCase {
	
	@Autowired
	SysUserMapper mapper;
	
	@Test
	public void testGetById() {
		SysUserDO userDO = mapper.selectByID(11l);
		System.out.println(userDO);
	}
	
	@Test
	public void testFindByCondition() {
		SysUserCondition condition = new SysUserCondition();
		condition.setRoleId(10l);
		condition.setStatus(1);
		List<SysUserDO> list = mapper.queryByCondition(condition);
		log.info("" + list.size());
		Assert.assertEquals(1, list.size());
	}
}
