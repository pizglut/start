package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.GodzinaNotFoundException;

import java.util.function.Supplier;

public class GodzinaExceptionSupplier {

    public static Supplier<GodzinaNotFoundException> godzinaNotFound(Long id) {
        return () -> new GodzinaNotFoundException(id);
    }
}
