package com.himalaya.common.dto;

import java.io.Serializable;

import com.himalaya.common.enums.AppErrorEnum;
import com.himalaya.common.enums.AppStatusEnum;

import lombok.ToString;

@ToString
public class AppResponse<T> implements Serializable {
	
	private static final long serialVersionUID = -6959850777565425359L;

	private String token;

	private String code;

	private String message;

	private T data;

	public AppResponse() {
		setResponseStatus(AppStatusEnum.SUCCESS);
	}
	
	public AppResponse(AppStatusEnum statusEnum, T data) {
		super();
		setResponseStatus(statusEnum);
		this.data = data;
	}
	
	public AppResponse(T data) {
		super();
		setResponseStatus(AppStatusEnum.SUCCESS);
		this.data = data;
	}
	
	public AppResponse(AppErrorEnum errorStatusEnum) {
		super();
		setErrorStatusEnum(errorStatusEnum);
	}

	public AppResponse(AppResponse<?> appResponse) {
		this.code = appResponse.getCode();
		this.message = appResponse.getMessage();
	}
	
	public static <T> AppResponse<T> newInstance(AppResponse<?> appResponse) {
		return new AppResponse<>(appResponse);
	}
	
	public static <T> AppResponse<T> newSuccess(T data) {
		return new AppResponse<>(data);
	}
	
	public static <T> AppResponse<T> newSuccess() {
		return newSuccess(null);
	}
	
	public static <T> AppResponse<T> newFail(AppErrorEnum errorInfoEnum) {
		return new AppResponse<>(errorInfoEnum);
	}
	
	public static <T> AppResponse<T> newFail(AppErrorEnum errorInfoEnum, String message) {
		AppResponse<T> appResponse = new AppResponse<T>(errorInfoEnum);
		appResponse.setMessage(message);
		return appResponse;
	}
		
	private void setErrorStatusEnum(AppErrorEnum errorStatusEnum) {
		this.setCode(errorStatusEnum.getCode());
		this.setMessage(errorStatusEnum.getMessage());
	}

	private void setResponseStatus(AppStatusEnum statusEnum) {
		this.setCode(statusEnum.getCode());
		this.setMessage(statusEnum.getDescription());
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
