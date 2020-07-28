package com.movies.api.core.domain;

import com.movies.api.core.enums.ErrorType;
import io.swagger.annotations.ApiModel;

@ApiModel(value = "ExceptionMessage", description = "Represents domain for API error reporting")
public class ExceptionMessage {

    private String message;
    private int code;

    public ExceptionMessage() {
        //just use this to use the set methods
    }

    public ExceptionMessage(final ErrorType errorType) {
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
    }

    public ExceptionMessage(final String message) {
        this.message = message;
    }

    public ExceptionMessage(final int codError, final String message) {
        this.code = codError;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

}
