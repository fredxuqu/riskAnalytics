package com.himalaya.app.user.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.BaseTestCase;
import com.himalaya.app.user.domain.NewsCondition;
import com.himalaya.app.user.domain.NewsDO;
import com.himalaya.app.user.service.NewsService;
import com.himalaya.common.dto.PageDTO;
import com.himalaya.common.dto.Paging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewsServiceImplTest extends BaseTestCase {

	@Autowired
	NewsService newsService;
	
	@Test
	public void testCountByCondition() {
		NewsCondition condition = new NewsCondition();
		condition.setType(2);
		Long count = newsService.countByCondition(condition);
		log.info("={}", count);
		Assert.assertEquals(3l, count.longValue());
	}
	
	@Test
	public void testQueryByPage() {
		NewsCondition condition = new NewsCondition();
		condition.setType(2);
		Paging paging = new Paging(1, 2);
		condition.setPaging(paging);
		PageDTO<NewsDO> pageDTO = newsService.queryByPage(condition);
		log.info("={}", pageDTO.getDatas().size());
	}
}
