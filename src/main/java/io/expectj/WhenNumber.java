package io.expectj;

import io.expectj.predicate.number.*;

import java.math.BigDecimal;

public class WhenNumber extends When<Number> {

    WhenNumber(final Number subject) {
        super(subject);
    }

    public WhenThrow<Number> isEqualTo(final Number value) {
        return new WhenThrow<>(subject, new EqualToPredicate(value));
    }

    public WhenThrow<Number> isNotEqualTo(final Number value) {
        return new WhenThrow<>(subject, new EqualToPredicate(value).negate());
    }

    public WhenThrow<Number> isGreaterThan(final Number value) {
        return new WhenThrow<>(subject, new GreaterThanPredicate(value));
    }

    public WhenThrow<Number> isGreaterThanOrEqualTo(final Number value) {
        return new WhenThrow<>(subject, new GreaterThanOrEqualToPredicate(value));
    }

    public WhenThrow<Number> isLessThan(final Number value) {
        return new WhenThrow<>(subject, new LessThanPredicate(value));
    }

    public WhenThrow<Number> isLessThanOrEqualTo(final Number value) {
        return new WhenThrow<>(subject, new LessThanOrEqualToPredicate(value));
    }

    public WhenThrow<Number> isBetween(final Number minInclusive, final Number maxExclusive) {
        return new WhenThrow<>(subject, new BetweenPredicate(minInclusive, maxExclusive));
    }

    public WhenThrow<Number> isNotBetween(final Number minInclusive, final Number maxExclusive) {
        return new WhenThrow<>(subject, new BetweenPredicate(minInclusive, maxExclusive).negate());
    }

    public WhenThrow<Number> isPositive() {
        return isGreaterThan(BigDecimal.ZERO);
    }

    public WhenThrow<Number> isNotPositive() {
        return isLessThanOrEqualTo(BigDecimal.ZERO);
    }

    public WhenThrow<Number> isNegative() {
        return isLessThan(BigDecimal.ZERO);
    }

    public WhenThrow<Number> isNotNegative() {
        return isGreaterThanOrEqualTo(BigDecimal.ZERO);
    }
}
