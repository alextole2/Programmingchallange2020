package com.movies.api.core.exception;


import com.movies.api.core.enums.ErrorType;

public class ServiceNotFoundException extends RuntimeException {
    private final int code;
    private final String message;

    public ServiceNotFoundException(final ErrorType errorType, final Throwable throwable) {
        super(throwable);
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
    }

    public ServiceNotFoundException(final ErrorType errorType) {
        super(errorType.getMessage());
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
    }

    public ServiceNotFoundException(final Integer code, final String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
