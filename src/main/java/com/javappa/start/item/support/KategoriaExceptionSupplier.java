package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.KategoriaNotFoundException;

import java.util.function.Supplier;

public class KategoriaExceptionSupplier {

    public static Supplier<KategoriaNotFoundException> kategoriaNotFound(Long id) {
        return () -> new KategoriaNotFoundException(id);
    }
}
