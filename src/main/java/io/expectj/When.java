package io.expectj;

import io.expectj.predicate.text.NullPredicate;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class When<T> {

    final T subject;

    When(T subject) {
        this.subject = subject;
    }

    public static <U> When<U> when(final U subject) {
        return new When<>(subject);
    }

    public static WhenCharSequence when(final CharSequence cs) {
        return new WhenCharSequence(cs);
    }

    public static WhenNumber when(final Number number) {
        return new WhenNumber(number);
    }

    public WhenThrow<T> is(final Predicate<T> predicate) {
        return new WhenThrow<>(subject, predicate);
    }

    public WhenThrow<T> is(final Supplier<Predicate<T>> supplier) {
        return is(supplier.get());
    }

    public WhenThrow<T> isNot(final Predicate<T> predicate) {
        return is(predicate.negate());
    }

    public WhenThrow<T> isNot(final Supplier<Predicate<T>> supplier) {
        return isNot(supplier.get());
    }

    public WhenThrow<T> isNull() {
        return is(NullPredicate::new);
    }

    public WhenThrow<T> isNotNull() {
        return isNot(NullPredicate::new);
    }
}
