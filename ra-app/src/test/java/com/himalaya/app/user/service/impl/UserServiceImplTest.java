package com.himalaya.app.user.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.BaseTestCase;
import com.himalaya.app.user.domain.UserCondition;
import com.himalaya.app.user.domain.UserDO;
import com.himalaya.app.user.service.UserService;
import com.himalaya.common.dto.PageDTO;
import com.himalaya.common.dto.Paging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImplTest extends BaseTestCase {

	@Autowired
	UserService userService;
	
	@Test
	public void testCountByCondition() {
		UserCondition condition = new UserCondition();
		condition.setStatus(1);
		Long count = userService.countByCondition(condition);
		log.info("={}", count);
		Assert.assertEquals(5l, count.longValue());
	}
	
	@Test
	public void testQueryByPage() {
		UserCondition condition = new UserCondition();
		condition.setStatus(1);
		Paging paging = new Paging(1, 2);
		condition.setPaging(paging);
		PageDTO<UserDO> pageDTO = userService.queryByPage(condition);
		log.info("={}", pageDTO.getDatas().size());
	}
}
