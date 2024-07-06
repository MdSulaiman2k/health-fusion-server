package com.health.fusion.api.exception;

public class ValidationException extends RuntimeException {
  private final int status;
  private final String errorCode;
  private final String errorMessage;
  private final String field;

  public ValidationException(int status, String errorCode, String errorMessage, String field) {
    super(errorCode);
    this.status = status;
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.field = field;
  }

  public ValidationException(int status, String errorCode, String errorMessage, String field, Throwable cause) {
    super(errorCode, cause);
    this.status = status;
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.field = field;
  }

  public int getStatus() {
    return this.status;
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }

  public String getField() {
    return this.field;
  }
}
