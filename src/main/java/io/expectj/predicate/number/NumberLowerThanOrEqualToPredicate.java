package io.expectj.predicate.number;

import java.util.function.Predicate;

public class NumberLowerThanOrEqualToPredicate implements Predicate<Number> {

    private final Number subject;

    public NumberLowerThanOrEqualToPredicate(final Number subject) {
        this.subject = subject;
    }

    @Override
    public boolean test(final Number value) {
        return new NumberGreaterThanPredicate(subject).negate().test(value);
    }
}
