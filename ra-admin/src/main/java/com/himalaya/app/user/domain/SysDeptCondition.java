package com.himalaya.app.user.domain;

import java.io.Serializable;

import com.himalaya.app.common.domain.BaseCondition;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysDeptCondition extends BaseCondition implements Serializable {

	private static final long serialVersionUID = -7489242830593472585L;

	private String name;

    private Long unitId;

    private Integer status;
}