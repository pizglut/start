package com.javappa.start.item.support.exception;

public class KategoriaNotFoundException extends RuntimeException{

    public KategoriaNotFoundException(Long id) {
        super(String.format("Kategoria with id %d not found", id));
    }

}
