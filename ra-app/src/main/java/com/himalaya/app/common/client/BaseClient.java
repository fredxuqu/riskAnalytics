package com.himalaya.app.common.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseClient {

	@Autowired
	public org.dozer.Mapper dozerMapper;
	
	protected <T> List<T> dozerMapperList(List<?> list, Class<T> destinationClass){
		List<T> returnList = new ArrayList<T>();
		if(list != null) {
			list.forEach(item -> {
				returnList.add(dozerMapper.map(item, destinationClass));
			});
		}
		return returnList;
	}
}
