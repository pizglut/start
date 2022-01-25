package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.DataRezerwacjiNotFoundException;
import java.util.function.Supplier;

public class DataRezerwacjiExceptionSupplier {

    public static Supplier<DataRezerwacjiNotFoundException> dataRezerwacjiNotFound(Long id) {
        return () -> new DataRezerwacjiNotFoundException(id);
    }
}
