package io.expectj.predicate.text;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;
import java.util.function.Predicate;

public class LengthEqualsToPredicate implements Predicate<CharSequence> {

    private final int length;

    public LengthEqualsToPredicate(final int length) {
        this.length = length;
    }

    @Override
    public boolean test(final CharSequence cs) {
        final CharSequence safeCs = Optional.ofNullable(cs).orElse(StringUtils.EMPTY);
        return safeCs.length() == length;
    }
}
