package com.himalaya.app.common.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.himalaya.app.common.domain.BaseCondition;
import com.himalaya.common.dto.PageDTO;
import com.himalaya.common.dto.Paging;

public class AbstractService {

	@Autowired
	public org.dozer.Mapper dozerMapper;
	
	protected <T> List<T> dozerMapList(List<?> list, Class<T> destinationClass){
		List<T> returnList = new ArrayList<T>();
		if(list != null) {
			list.forEach(item -> {
				returnList.add(dozerMapper.map(item, destinationClass));
			});
		}
		return returnList;
	}
	
	protected <C extends BaseCondition, T> PageDTO<T> findPage(C condition, PageAction action) {
		if (condition != null) {
			Assert.notNull(condition.getPaging(), "Paging parameter is null!");
		}
		Paging paging = condition.getPaging();
		int pageNum = paging.getPageNo();
		int pageSize = paging.getPageSize();
		Page<T> page = PageHelper.startPage(pageNum, pageSize);
		action.execute();
		PageDTO<T> pageDTO = new PageDTO<T>(page);
		pageDTO.setCount(page.getTotal());
		pageDTO.setIndex(page.getPageNum());
		return pageDTO;
	}
	
	protected <T> PageDTO<T> findPage(Paging paging, PageAction action) {
		Assert.notNull(paging, "Paging parameter is null!");
		Page<T> page = PageHelper.startPage(paging.getPageNo(), paging.getPageSize());
		action.execute();
		PageDTO<T> pageDTO = new PageDTO<T>(page);
		pageDTO.setCount(page.getTotal());
		pageDTO.setIndex(page.getPageNum());
		return pageDTO;
	}
	
	@FunctionalInterface
	protected interface PageAction {
		
		void execute();
	}
}
