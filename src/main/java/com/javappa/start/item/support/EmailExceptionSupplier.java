package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.EmailNotFoundException;
import java.util.function.Supplier;

public class EmailExceptionSupplier {

    public static Supplier<EmailNotFoundException> emailNotFound(Long id) {
        return () -> new EmailNotFoundException(id);
    }
}
