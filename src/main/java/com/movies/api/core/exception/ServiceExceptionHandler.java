package com.movies.api.core.exception;

import com.movies.api.core.domain.ExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ServiceExceptionHandler {

    @ExceptionHandler(value = ServiceException.class)
    public ResponseEntity<ExceptionMessage> handleServiceException(final ServiceException exception) {
        final ExceptionMessage message = new ExceptionMessage();
        message.setCode(exception.getCode());
        message.setMessage(exception.getMessage());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = ServiceNotFoundException.class)
    public ResponseEntity<ExceptionMessage> handleServiceException(final ServiceNotFoundException exception) {
        final ExceptionMessage message = new ExceptionMessage();
        message.setCode(exception.getCode());
        message.setMessage(exception.getMessage());
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
