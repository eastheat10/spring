package net.skhu.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRegistration {

	@NotEmpty(message="학번을 입력하세요.")
	@Size(min=3, max=15)
	String userid;

	@NotEmpty(message="비밀번호를 입력하세요.")
	@Size(min=6, max=12, message="6 자리 이상 12 자리 이하이어야 합니다.")
	String passwd1;

	@NotEmpty(message="비밀번호를 한번 더 입력하세요.")
	String passwd2;

	@NotEmpty(message="이름을 입력하세요.")
	@Size(min=3, max=30)
	String name;

	@NotEmpty(message="이메일 주소를 입력하세.")
	@Email(message="이메일 주소가 올바르지 않습니다.")
	String email;

	@NotEmpty(message="사용자 유형을 선택하세요.")
	String userType;
}
