package com.javappa.start.item.support.exception;

public class ArtykulNotFoundException extends RuntimeException{

    public ArtykulNotFoundException(Long id) {
        super(String.format("Artykul with id %d not found", id));
    }
}
