package com.himalaya.app.user.domain;

import java.io.Serializable;

import com.himalaya.app.common.domain.BaseCondition;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysFuncCondition extends BaseCondition implements Serializable {

	private static final long serialVersionUID = 4983466480038794643L;

	private String code;

    private String name;

    private Integer status;
}