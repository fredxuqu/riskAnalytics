package com.himalaya.app.user.domain;

import com.himalaya.app.common.domain.BaseDO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class SysDeptDO extends BaseDO {
	
	private static final long serialVersionUID = 7435860368536747184L;

	private String name;

    private Long unitId;

    private Integer status;
}