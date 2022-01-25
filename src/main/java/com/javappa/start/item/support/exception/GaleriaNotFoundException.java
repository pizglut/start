package com.javappa.start.item.support.exception;

public class GaleriaNotFoundException extends RuntimeException {

    public GaleriaNotFoundException(Long id) {
        super(String.format("Zdjecie with id %d not found", id));
    }

}
