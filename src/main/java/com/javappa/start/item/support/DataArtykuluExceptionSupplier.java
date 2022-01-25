package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.DataArtykuluNotFoundException;

import java.util.function.Supplier;

public class DataArtykuluExceptionSupplier {

    public static Supplier<DataArtykuluNotFoundException> dataArtykuluNotFound(Long id) {
        return () -> new DataArtykuluNotFoundException(id);
    }

}
