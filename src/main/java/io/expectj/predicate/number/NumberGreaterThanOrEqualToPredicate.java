package io.expectj.predicate.number;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Predicate;

public class NumberGreaterThanOrEqualToPredicate implements Predicate<Number> {

    private final BigDecimal subject;

    public NumberGreaterThanOrEqualToPredicate(final Number subject) {
        this.subject = new BigDecimal(String.valueOf(subject));
    }

    @Override
    public boolean test(final Number value) {
        if (Objects.nonNull(value)) {
            final BigDecimal decimalSubject = new BigDecimal(String.valueOf(value));
            return this.subject.compareTo(decimalSubject) <= 0;
        }
        return false;
    }
}
