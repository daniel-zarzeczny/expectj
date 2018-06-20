package io.expectj.predicate.number;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Predicate;

public class NumberBetweenPredicate implements Predicate<Number> {

    private final BigDecimal minInclusive;
    private final BigDecimal maxExclusive;

    public NumberBetweenPredicate(final Number minInclusive, final Number maxExclusive) {
        this.minInclusive = new BigDecimal(String.valueOf(minInclusive));
        this.maxExclusive = new BigDecimal(String.valueOf(maxExclusive));
    }

    @Override
    public boolean test(final Number number) {
        if (Objects.nonNull(number)) {
            final BigDecimal decimal = new BigDecimal(String.valueOf(number));
            return decimal.compareTo(minInclusive) >= 0 && decimal.compareTo(maxExclusive) < 0;
        }
        return false;
    }
}
