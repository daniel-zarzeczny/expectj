package io.expectj.predicate.number;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Predicate;

public class EqualToPredicate implements Predicate<Number> {

    private final BigDecimal subject;

    public EqualToPredicate(final Number subject) {
        this.subject = new BigDecimal(String.valueOf(subject));
    }

    @Override
    public boolean test(final Number value) {
        if (Objects.nonNull(value)) {
            final BigDecimal decimal = new BigDecimal(String.valueOf(value));
            return subject.compareTo(decimal) == 0;
        }
        return false;
    }
}
