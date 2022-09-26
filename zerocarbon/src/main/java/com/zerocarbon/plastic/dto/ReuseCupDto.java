package com.zerocarbon.plastic.dto;



import java.util.Date;

import javax.validation.constraints.PositiveOrZero;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ReuseCupDto {
	private String canId;
	
	private String canName;
	
	private String content;
	
	private String like;

	@PositiveOrZero(message = "우편번호는 숫자만 입력해주세요.")
	private String zipCode;

	private String roadAddress;
	
	private String restAddress;
	
	private String latitude;
	
	private String longitude;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private Date curDate;

}
