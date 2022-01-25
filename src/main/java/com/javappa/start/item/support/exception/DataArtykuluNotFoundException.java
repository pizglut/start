package com.javappa.start.item.support.exception;

public class DataArtykuluNotFoundException extends RuntimeException{

    public DataArtykuluNotFoundException(Long id) {
        super(String.format("Data Artykulu with id %d not found", id));
    }

}
