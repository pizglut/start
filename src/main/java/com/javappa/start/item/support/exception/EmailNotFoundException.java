package com.javappa.start.item.support.exception;

public class EmailNotFoundException extends RuntimeException{

    public EmailNotFoundException(Long id) {
        super(String.format("Email with id %d not found", id));
    }

}
