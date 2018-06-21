package io.expectj.predicate.number;

import java.util.function.Predicate;

public class LessThanOrEqualToPredicate implements Predicate<Number> {

    private final Number subject;

    public LessThanOrEqualToPredicate(final Number subject) {
        this.subject = subject;
    }

    @Override
    public boolean test(final Number value) {
        return new GreaterThanPredicate(subject).negate().test(value);
    }
}
