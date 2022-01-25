package com.javappa.start.item.support;


import com.javappa.start.item.support.exception.TytulNotFoundException;
import java.util.function.Supplier;

public class TytulExceptionSupplier {

    public static Supplier<TytulNotFoundException> tytulNotFound(Long id) {
        return () -> new TytulNotFoundException(id);
    }
}
