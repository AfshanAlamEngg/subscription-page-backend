package com.qrencia.subscription.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
