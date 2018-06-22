package io.expectj.predicate.text;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;

public class EndsWithPrefix implements Predicate<CharSequence> {

    private final CharSequence suffix;

    public EndsWithPrefix(final CharSequence suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean test(final CharSequence subject) {
        return StringUtils.endsWith(subject, suffix);
    }
}
