package com.himalaya.app.user.domain;

import java.io.Serializable;

import com.himalaya.app.common.domain.BaseCondition;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysRoleCondition extends BaseCondition implements Serializable {

	private static final long serialVersionUID = 7516386614709365814L;

	private String name;

    private Integer status;
}