package com.himalaya.app.user.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.BaseTestCase;
import com.himalaya.app.user.domain.SysUserCondition;
import com.himalaya.app.user.domain.SysUserDO;
import com.himalaya.app.user.service.SysUserService;
import com.himalaya.common.dto.PageDTO;
import com.himalaya.common.dto.Paging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImplTest extends BaseTestCase {

	@Autowired
	SysUserService userService;
	
	@Test
	public void testCountByCondition() {
		SysUserCondition condition = new SysUserCondition();
		condition.setStatus(1);
		Long count = userService.countByCondition(condition);
		log.info("={}", count);
		Assert.assertEquals(5l, count.longValue());
	}
	
	@Test
	public void testQueryByPage() {
		SysUserCondition condition = new SysUserCondition();
		condition.setStatus(1);
		Paging paging = new Paging(1, 2);
		condition.setPaging(paging);
		PageDTO<SysUserDO> pageDTO = userService.queryByPage(condition);
		log.info("={}", pageDTO.getDatas().size());
	}
}
