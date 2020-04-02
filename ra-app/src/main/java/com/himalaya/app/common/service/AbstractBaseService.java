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

	/**
	 * insert
	 * @param entity
	 * @return
	 */
	@Override
	public int insert(Entity entity) {
		return mapper.insert(entity);
	}

	/**
	 * delete by id
	 * @param id
	 * @return
	 */
	@Override
	public int delete(PK id) {
		return mapper.delete(id);
	}

	/**
	 * update
	 * @param entity
	 * @return
	 */
	@Override
	public int update(Entity entity) {
		return mapper.update(entity);
	}

	/**
	 * query by ID
	 * @param id
	 * @return
	 */
	@Override
	public Entity selectByID(PK id) {
		return mapper.selectByID(id);
	}

	/**
	 * query by condition
	 * @param condition
	 * @param <T>
	 * @return
	 */
	@Override
	public <T> List<Entity> queryByCondition(T condition) {
		return mapper.queryByCondition(condition);
	}

	/**
	 * count by condition
	 * @param condition
	 * @param <T>
	 * @return
	 */
	@Override
	public <T extends BaseCondition> Long countByCondition(T condition) {
		return mapper.countByCondition(condition);
	}

	/**
	 * query by page
	 * @param condition
	 * @param <T>
	 * @return
	 */
	@Override
	public <T extends BaseCondition> PageDTO<Entity> queryByPage(T condition) {
		return findPage(condition, ()-> mapper.queryByCondition(condition));
	}

	/**
	 * query all records
	 * @return
	 */
	@Override
	public List<Entity> queryAll() {
		return null;
	}
}
