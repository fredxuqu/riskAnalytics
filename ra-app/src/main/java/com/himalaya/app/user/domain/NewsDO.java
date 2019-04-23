package com.himalaya.app.user.domain;

import java.util.Date;

import com.himalaya.app.common.domain.BaseDO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class NewsDO extends BaseDO {
    
	private static final long serialVersionUID = -9217785715241173591L;

	private String title;

    private String author;

    private Integer type;

    private Date publishTime;

    private String content;
}