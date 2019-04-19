package com.himalaya.app.common.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseCondition implements Serializable {

	private static final long serialVersionUID = 3116940018513373605L;

	private Long id;
	
	private String createUser;
	
	private Date createTime;
	
	private String modifyUser;
	
	private Date modifyTime;
}
