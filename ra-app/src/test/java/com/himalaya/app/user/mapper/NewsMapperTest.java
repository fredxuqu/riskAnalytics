package com.himalaya.app.user.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.BaseTestCase;
import com.himalaya.app.user.domain.NewsCondition;
import com.himalaya.app.user.domain.NewsDO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewsMapperTest extends BaseTestCase {
	
	@Autowired
	NewsMapper mapper;
	
	@Test
	public void testInsert() {
		NewsDO newsDO = new NewsDO();
		newsDO.setAuthor("Fred");
		newsDO.setId(5l);
		newsDO.setTitle("test news");
		newsDO.setType(1);
		newsDO.setPublishTime(new Date());
		newsDO.setContent("<head><user>fred</user><age>32</age></head>");
		newsDO.setCreateUser("admin");
		newsDO.setCreateTime(new Date());
		newsDO.setModifyUser("admin");
		newsDO.setModifyTime(new Date());
		mapper.insert(newsDO);
		log.info("={}", newsDO.getId());
		System.out.println(newsDO);
	}
	
	@Test
	public void testUpdate() {
		NewsDO newsDO = new NewsDO();
		newsDO.setId(5l);
		newsDO.setContent("<head><user>fred</user><age>33</age></head>");
		newsDO.setModifyUser("admin");
		newsDO.setModifyTime(new Date());
		mapper.update(newsDO);
		log.info("={}", newsDO.getId());
		System.out.println(newsDO);
	}
	
	@Test
	public void testGetById() {
		NewsDO newsDO = mapper.selectByID(1l);
		System.out.println(newsDO);
	}
	
	@Test
	public void testFindByCondition() {
		NewsCondition condition = new NewsCondition();
		condition.setCreateUser("admin");
		List<NewsDO> list = mapper.queryByCondition(condition);
		log.info("" + list.size());
		Assert.assertEquals(1, list.size());
	}
}
