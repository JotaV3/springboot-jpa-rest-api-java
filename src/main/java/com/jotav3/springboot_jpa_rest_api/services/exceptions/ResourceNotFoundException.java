package com.jotav3.springboot_jpa_rest_api.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id: " + id);
    }
}
