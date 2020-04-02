package com.himalaya.app.common.mapper;

import java.util.List;

/**
 * @author xuqu
 */
public interface IBaseMapper<Entity, PK> {
	
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
     * @param condition
     * @return
     */
    <C> List<Entity> queryByCondition(C condition);
    
    /**
     * Count by condition
     * @param condition
     * @return
     */
    <C> Long countByCondition(C condition);
}
