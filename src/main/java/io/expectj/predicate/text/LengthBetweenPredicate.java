package io.expectj.predicate.text;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;
import java.util.function.Predicate;

public class LengthBetweenPredicate implements Predicate<CharSequence> {

    private final int minLength;
    private final int maxLength;

    public LengthBetweenPredicate(final int minLengthInclusive, final int maxLengthExclusive) {
        this.minLength = minLengthInclusive;
        this.maxLength = maxLengthExclusive;
    }

    @Override
    public boolean test(final CharSequence cs) {
        final CharSequence safeCs = Optional.ofNullable(cs).orElse(StringUtils.EMPTY);
        return safeCs.length() >= minLength && safeCs.length() < maxLength;
    }
}
