package com.javappa.start.item.support.exception;

public class ImieNotFoundException extends RuntimeException{

    public ImieNotFoundException(Long id) {
        super(String.format("Imie with id %d not found", id));
    }
}
