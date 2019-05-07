package com.himalaya.user.dto;

import com.himalaya.common.dto.BaseConditionDTO;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel("User Conditions")
public class SysUserConditionDTO extends BaseConditionDTO {
	
	private static final long serialVersionUID = 7749714030937344412L;

	private String userName;

    private String email;

    private String password;

    private String roleId;

    private Integer status;
}
