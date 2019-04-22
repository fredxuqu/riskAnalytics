package com.himalaya.app.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.app.common.domain.BaseCondition;
import com.himalaya.app.common.mapper.IBaseMapper;
import com.himalaya.common.dto.PageDTO;

public class AbstractBaseService<Mapper extends IBaseMapper<Entity, PK>, Entity, PK> extends AbstractService
		implements IBaseService<Entity, PK> {

	@Autowired
	private Mapper mapper;

	@Override
	public int insert(Entity entity) {
		return mapper.insert(entity);
	}

	@Override
	public int delete(PK id) {
		return mapper.delete(id);
	}

	@Override
	public int update(Entity entity) {
		return mapper.update(entity);
	}

	@Override
	public Entity selectByID(PK id) {
		return mapper.selectByID(id);
	}

	@Override
	public <C extends BaseCondition> List<Entity> queryByCondition(C condition) {
		return mapper.queryByCondition(condition);
	}

	@Override
	public <C extends BaseCondition> Long countByCondition(C condition) {
		return mapper.countByCondition(condition);
	}

	@Override
	public <C extends BaseCondition> PageDTO<Entity> queryByPage(C condition) {
		return findPage(condition, () -> mapper.queryByCondition(condition));
	}

	@Override
	public List<Entity> queryAll() {
		return null;
	}
}
