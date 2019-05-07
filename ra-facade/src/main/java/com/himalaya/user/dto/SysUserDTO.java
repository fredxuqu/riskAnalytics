package com.himalaya.user.dto;

import java.io.Serializable;

import com.himalaya.common.dto.BaseDTO;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel("Sys User Informations")
public class SysUserDTO extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 7749714030937344412L;

	private String userName;

    private String email;

    private String password;

    private String roleId;

    private Integer status;
}
