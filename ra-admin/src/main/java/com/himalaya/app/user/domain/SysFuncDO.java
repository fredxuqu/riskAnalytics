package com.himalaya.app.user.domain;

import com.himalaya.app.common.domain.BaseDO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class SysFuncDO extends BaseDO {
    
	private static final long serialVersionUID = -2355674703303536758L;

	private String code;

    private String name;

    private Integer status;
}