package com.zerocarbon.plastic.dto;

import com.zerocarbon.plastic.enums.ResultCode;
import lombok.Data;

    /*api 반환 객체*/
@Data
public class ApiResponse<T> {
	private int resultCode;
	private String message;
	private T data;
	
	
	/* 성공 시 반환 */ 
	@SuppressWarnings("rawtypes")
	public static ApiResponse ok() {
		ApiResponse response = new ApiResponse();
		response.setResultCode(ResultCode.OK.getCode());
		response.setMessage(ResultCode.OK.getMessage());
		return response;
	}

	/* 성공 시 데이터 포함 */
	@SuppressWarnings("unchecked")
	public static<T> ApiResponse<T> ok(T data) {
		ApiResponse<T> response = ok();
		response.setData(data);
		return response;
	}

	/* 실패 시 반환 */
	@SuppressWarnings("rawtypes")
	public static ApiResponse fail(int code, String message) {
		ApiResponse response = new ApiResponse();
		response.setResultCode(code);
		response.setMessage(message);
		return response;
	}

}
