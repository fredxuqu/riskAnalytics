package com.himalaya.app.common.mapper;

import java.util.List;

import com.himalaya.app.user.domain.UserDO;

/**
 * @author xuqu
 */
public interface IBaseMapper<E, PK> {
	
	/**
	 * Insert
	 * @param record
	 * @return
	 */
    int insert(UserDO entity);
    
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
     * @param id
     * @return
     */
    <T> List<E> queryByCondition(T condition);
    
    /**
     * Count by condition
     * @param id
     * @return
     */
    <T> Long countByCondition(T condition);
}
