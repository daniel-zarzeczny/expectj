package io.expectj.predicate.number;

import java.util.function.Predicate;

public class LessThanPredicate implements Predicate<Number> {

    private final Number subject;

    public LessThanPredicate(final Number subject) {
        this.subject = subject;
    }

    @Override
    public boolean test(final Number value) {
        return new GreaterThanOrEqualToPredicate(subject).negate().test(value);
    }
}
