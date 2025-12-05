package com.invoiceCreate.service.exceptionhandle;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.invoiceCreate.service.exception.ProductNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	 @ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleException(ProductNotFoundException ex){
		Map<String, Object> body = new HashMap<>();
		 body.put("timestamp", LocalDateTime.now().toString());
	        body.put("status", 404);
	        body.put("error", "Product Not Found");
	        body.put("message", ex.getMessage());

	        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}

	
}
