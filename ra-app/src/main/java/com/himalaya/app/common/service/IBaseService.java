package com.himalaya.app.common.service;

import java.util.List;

import com.himalaya.app.common.domain.BaseCondition;

public interface IBaseService <E, PK>{
	/**
	 * Insert
	 * @param entity
	 * @return
	 */
    int insert(E entity);
    
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
    int update(E entity);

    /**
     * Select by primary key
     * @param id
     * @return
     */
    E selectByID(PK id);

    /**
     * Find by condition
     * @param T condition
     * @return
     */
    <T extends BaseCondition> List<E> queryByCondition(T condition);
    
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
    <T extends BaseCondition> List<E> queryByPage(T condition);
    
    /**
     * Query all records
     * @return
     */
    List<E> queryAll();
}
