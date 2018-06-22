package io.expectj.predicate.text;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;

public class StartsWithPredicate implements Predicate<CharSequence> {

    private final CharSequence prefix;

    public StartsWithPredicate(final CharSequence prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean test(final CharSequence subject) {
        return StringUtils.startsWith(subject, prefix);
    }
}
