package io.expectj;

import java.util.function.Supplier;

public interface Throw {

    <X extends RuntimeException> void thenThrow(final Supplier<? extends X> exceptionSupplier);
}
