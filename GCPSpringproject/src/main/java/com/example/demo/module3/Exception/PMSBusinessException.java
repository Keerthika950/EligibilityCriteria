package com.example.demo.module3.Exception;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class PMSBusinessException extends ResponseEntityExceptionHandler{
	@ExceptionHandler(TenthMarksNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(TenthMarksNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(621);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(TwelthMarksNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(TwelthMarksNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(622);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UGMarksNotEmpty.class)
	public ResponseEntity<PMSException> resourceNotFound(UGMarksNotEmpty ex,WebRequest request){
		PMSException response = new PMSException();
		response.setErrorCode(623);
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<PMSException>(response,HttpStatus.NOT_FOUND);
	}
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
		});
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}

}
