package io.expectj.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class NullPredicate<T> implements Predicate<T> {

    @Override
    public boolean test(final T subject) {
        return Objects.isNull(subject);
    }
}
