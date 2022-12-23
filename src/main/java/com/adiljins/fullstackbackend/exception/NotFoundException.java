package com.adiljins.fullstackbackend.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(Long id) {
        super("Could not found with id " + id);
    }
}
