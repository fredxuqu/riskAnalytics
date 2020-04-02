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

	/**
	 * copy list
	 * @param list
	 * @param destinationClass
	 * @param <T>
	 * @return
	 */
	protected <T> List<T> dozerMapList(List<?> list, Class<T> destinationClass){
		List<T> returnList = new ArrayList<T>();
		if(list != null) {
			list.forEach(item -> {
				returnList.add(dozerMapper.map(item, destinationClass));
			});
		}
		return returnList;
	}

	/**
	 * get paging information from condition
	 * @param condition
	 * @param action
	 * @param <C>
	 * @param <T>
	 * @return
	 */
	protected <C extends BaseCondition, T> PageDTO<T> findPage(C condition, PageAction action) {
		if (condition != null) {
			Assert.notNull(condition.getPaging(), "Paging parameter is null!");
		}
		Paging paging = condition.getPaging();
		int pageNum = paging.getPageNo();
		int pageSize = paging.getPageSize();
		String orderBy = paging.getOrderBy();
		Page<T> page = PageHelper.startPage(pageNum, pageSize, orderBy);
		action.execute();
		PageDTO<T> pageDTO = new PageDTO<T>(page);
		pageDTO.setCount(page.getTotal());
		pageDTO.setIndex(page.getPageNum());
		return pageDTO;
	}

	/**
	 * provide paging condition directly
	 * @param paging
	 * @param action
	 * @param <T>
	 * @return
	 */
	protected <T> PageDTO<T> findPage(Paging paging, PageAction action) {
		Assert.notNull(paging, "Paging parameter is null!");
		Page<T> page = PageHelper.startPage(paging.getPageNo(), paging.getPageSize());
		action.execute();
		PageDTO<T> pageDTO = new PageDTO<T>(page);
		pageDTO.setCount(page.getTotal());
		pageDTO.setIndex(page.getPageNum());
		return pageDTO;
	}

	/**
	 * Paging query logic
	 */
	@FunctionalInterface
	protected interface PageAction {
		
		void execute();
	}
}
