package com.himalaya.common.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseConditionDTO implements Serializable {

	private static final long serialVersionUID = 3116940018513373605L;

	private Long id;
	
	private String createUser;
	
	private Date createTime;
	
	private String modifyUser;
	
	private Date modifyTime;
	
	private Paging paging;
	
	private String sort;
}