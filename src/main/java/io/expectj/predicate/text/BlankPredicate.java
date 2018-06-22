package io.expectj.predicate.text;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;

public class BlankPredicate implements Predicate<CharSequence> {

    @Override
    public boolean test(final CharSequence cs) {
        return StringUtils.isBlank(cs);
    }
}
