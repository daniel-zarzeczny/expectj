package io.expectj;

import io.expectj.predicate.number.*;

public class WhenNumber extends When<Number> {

    WhenNumber(final Number subject) {
        super(subject);
    }

    public WhenThrow<Number> isEqualTo(final Number value) {
        return new WhenThrow<>(subject, new NumberEqualToPredicate(value));
    }

    public WhenThrow<Number> isNotEqualTo(final Number value) {
        return new WhenThrow<>(subject, new NumberEqualToPredicate(value).negate());
    }

    public WhenThrow<Number> isGreaterThan(final Number value) {
        return new WhenThrow<>(subject, new NumberGreaterThanPredicate(value));
    }

    public WhenThrow<Number> isGreaterThanOrEqualTo(final Number value) {
        return new WhenThrow<>(subject, new NumberGreaterThanOrEqualToPredicate(value));
    }

    public WhenThrow<Number> isLowerThan(final Number value) {
        return new WhenThrow<>(subject, new NumberLowerThanPredicate(value));
    }

    public WhenThrow<Number> isLowerThanOrEqualTo(final Number value) {
        return new WhenThrow<>(subject, new NumberLowerThanOrEqualToPredicate(value));
    }

    public WhenThrow<Number> isBetween(final Number minInclusive, final Number maxExclusive) {
        return new WhenThrow<>(subject, new NumberBetweenPredicate(minInclusive, maxExclusive));
    }

    public WhenThrow<Number> isNotBetween(final Number minInclusive, final Number maxExclusive) {
        return new WhenThrow<>(subject, new NumberBetweenPredicate(minInclusive, maxExclusive).negate());
    }
}
