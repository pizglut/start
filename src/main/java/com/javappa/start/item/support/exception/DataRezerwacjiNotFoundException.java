package com.javappa.start.item.support.exception;

public class DataRezerwacjiNotFoundException extends RuntimeException{

    public DataRezerwacjiNotFoundException(Long id) {
        super(String.format("Data Rezerwacji with id %d not found", id));
    }

}
