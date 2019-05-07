package com.himalaya.common.enums;

import org.apache.commons.lang3.StringUtils;

public enum AppErrorEnum implements BaseEnum<String>{

	E000("System Error"),
	E001("Format of error code is wrong!"),
	
	E100("System Exception, Please try again late!"),
	E101("System is handling your request, please try again late!");
	
	private String message;
	
	AppErrorEnum(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getCode() {
		String errorCode = this.name().substring(1);
		boolean isNumeric = StringUtils.isNumeric(errorCode);
		if (isNumeric) {
			return errorCode;
		}
		throw new RuntimeException(E001.getMessage());
	}
}
