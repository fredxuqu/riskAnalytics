package com.himalaya.app.common.client;

import com.himalaya.common.dto.PageDTO;

public abstract class AbstractBaseClient extends BaseClient{

	public <T> PageDTO<T> dozerMapperPage(PageDTO<?> page, Class<T> destinationClass) {
		
		PageDTO<T> pageDTO = new PageDTO<T>();
		pageDTO.setCount(page.getCount());
		pageDTO.setIndex(page.getIndex());
		pageDTO.setOthers(page.getOthers());
		pageDTO.setDatas(dozerMapperList(page.getDatas(), destinationClass));
		return pageDTO;
	}
}
