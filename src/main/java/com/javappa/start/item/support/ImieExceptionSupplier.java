package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.ImieNotFoundException;
import java.util.function.Supplier;

public class ImieExceptionSupplier {

    public static Supplier<ImieNotFoundException> imieNotFound(Long id) {
        return () -> new ImieNotFoundException(id);
    }
}
