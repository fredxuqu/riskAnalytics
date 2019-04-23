package com.himalaya.app.user.domain;

import java.io.Serializable;

import com.himalaya.app.common.domain.BaseCondition;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserCondition extends BaseCondition implements Serializable {

	private static final long serialVersionUID = 7749714030937344412L;

	private String userName;

	private String email;

	private String password;

	private String roleId;

	private Integer status;
}