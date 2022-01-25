package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.ArtykulNotFoundException;
import java.util.function.Supplier;

public class ArtykulExceptionSupplier {

    public static Supplier<ArtykulNotFoundException> artykulNotFound(Long id) {
        return () -> new ArtykulNotFoundException(id);
    }
}
