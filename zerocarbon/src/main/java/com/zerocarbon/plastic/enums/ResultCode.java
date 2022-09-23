package com.zerocarbon.plastic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
	OK(0, "ok"),
	INVALID_PARAMETER(1001, "파라미터가 올바르지 않습니다.");
	
	private final int code;
	private final String message;

}
