package com.zerocarbon.plastic.dto;

import com.zerocarbon.plastic.enums.ResultCode;

import lombok.Data;
@Data
public class ApiResponse<T> {
	private int resultCode;
	private String message;
	private T data;
	
	@SuppressWarnings("rawtypes")
	public static ApiResponse ok() {
		ApiResponse response = new ApiResponse();
		response.setResultCode(ResultCode.OK.getCode());
		response.setMessage(ResultCode.OK.getMessage());
		return response;
	}
	@SuppressWarnings("unchecked")
	public static<T> ApiResponse<T> ok(T data) {
		ApiResponse<T> response = ok();
		response.setData(data);
		return response;
	}
	@SuppressWarnings("rawtypes")
	public static ApiResponse fail(int code, String message) {
		ApiResponse response = new ApiResponse();
		response.setResultCode(code);
		response.setMessage(message);
		return response;
	}

}
