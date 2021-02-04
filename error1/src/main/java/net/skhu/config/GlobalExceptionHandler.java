package net.skhu.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception exception) {
		log.error("전역 에러", exception);
		return "error";		//	error.jsp
	}
}
