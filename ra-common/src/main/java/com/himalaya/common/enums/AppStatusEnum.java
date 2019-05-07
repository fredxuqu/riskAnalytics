package com.himalaya.common.enums;

public enum AppStatusEnum {

	SUCCESS("0","Success"),
	
	FAIL("1", "Failed"),
	
	NOT_FOUND("2", "Not Found");
	
	private final String code;
	
	private final String description;
	
	AppStatusEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public String toString() {
		return this.code + " : " + this.description;
	}
}
