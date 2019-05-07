package com.himalaya.app.user.domain;

import com.himalaya.app.common.domain.BaseDO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class SysRoleDO extends BaseDO {

	private static final long serialVersionUID = -2194079342901388649L;

	private String name;

    private Integer status;
}