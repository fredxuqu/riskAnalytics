package com.himalaya.app.common.service;

import java.util.List;

import com.himalaya.app.common.domain.BaseCondition;
import com.himalaya.common.dto.PageDTO;

public interface IBaseService <Entity, PK>{
	/**
	 * Insert
	 * @param entity
	 * @return
	 */
    int insert(Entity entity);
    
	/**
	 * Delete by primary key
	 * @param id
	 * @return
	 */
	int delete(PK id);

    /**
     * Update
     * @param entity
     * @return
     */
    int update(Entity entity);

    /**
     * Select by primary key
     * @param id
     * @return
     */
    Entity selectByID(PK id);

    /**
     * Find by condition
     * @param T condition
     * @return
     */
    <T extends BaseCondition> List<Entity> queryByCondition(T condition);
    
    /**
     * Count by condition
     * @param T condition
     * @return
     */
    <T extends BaseCondition> Long countByCondition(T condition);
    
    /**
     * Paging find by condition 
     * @param <T>
     * @param condition
     * @return
     */
    <T extends BaseCondition> PageDTO<Entity> queryByPage(T condition);
    
    /**
     * Query all records
     * @return
     */
    List<Entity> queryAll();
}
