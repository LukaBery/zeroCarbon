package com.zerocarbon.plastic.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class UserDto {
	@NotBlank(message = "아이디는 필수 입력 값입니다.")
	private String userId;
	
	@NotBlank(message = "비밀번호는 필수 입력 값입니다.")
	@Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
    message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
	private String userPwd;
	
	@NotBlank(message = "이름은 필수 입력 값입니다.")
	@Size(min = 2, max = 20, message = "이름을 2~20자 사이로 입력해주세요.")
	private String userName;
	
    @Email(message = "이메일 형식에 맞지 않습니다.")
	private String email;
    
	@NotBlank(message = "휴대폰 번호는 필수 입력 값입니다.")
	private String userPhone;
	
	private String salt;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private Date joinDate;

}
