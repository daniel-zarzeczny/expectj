package io.expectj.predicate.number;

import java.util.function.Predicate;

public class NumberLowerThanPredicate implements Predicate<Number> {

    private final Number subject;

    public NumberLowerThanPredicate(final Number subject) {
        this.subject = subject;
    }

    @Override
    public boolean test(final Number value) {
        return new NumberGreaterThanOrEqualToPredicate(subject).negate().test(value);
    }
}
