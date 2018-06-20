package io.expectj;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class WhenThrow<T> implements Throw {

    private final T subject;
    private final Predicate<T> predicate;

    WhenThrow(final T subject, final Predicate<T> predicate) {
        this.subject = subject;
        this.predicate = predicate;
    }

    public <X extends RuntimeException> void thenThrow(final Supplier<? extends X> exceptionSupplier) {
        if (predicate.test(subject)) {
            throw exceptionSupplier.get();
        }
    }

}
