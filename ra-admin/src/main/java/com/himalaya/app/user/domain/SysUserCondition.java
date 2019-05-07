package com.himalaya.app.user.domain;

import java.io.Serializable;

import com.himalaya.app.common.domain.BaseCondition;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserCondition extends BaseCondition implements Serializable {

	private static final long serialVersionUID = 7749714030937344412L;

	private String name;

    private String userName;

    private String email;

    private String phone;

    private String password;

    private Long roleId;

    private Long deptId;

    private Integer status;
}