package com.javappa.start.item.support.exception;

public class TytulNotFoundException extends RuntimeException{

    public TytulNotFoundException(Long id) {
        super(String.format("Tytul with id %d not found", id));
    }

}
