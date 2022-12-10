package com.ssd.empmanagement.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.BAD_REQUEST)
public class EmpnameException extends RuntimeException {

	public EmpnameException(String msg) {
		super(msg);
	}
}
