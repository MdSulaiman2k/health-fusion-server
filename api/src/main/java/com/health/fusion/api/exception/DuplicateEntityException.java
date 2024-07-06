package com.health.fusion.api.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class DuplicateEntityException extends ValidationException {
  public DuplicateEntityException(String errorCode, String message, String field) {
    super(HttpStatus.CONFLICT.value(), errorCode, message, field);
  }

}
