package io.expectj.predicate.text;

import java.util.Objects;
import java.util.function.Predicate;

public class EqualToPredicate implements Predicate<CharSequence> {

    private CharSequence subject;

    public EqualToPredicate(final CharSequence subject) {
        this.subject = subject;
    }

    @Override
    public boolean test(final CharSequence cs) {
        if (Objects.isNull(subject)) {
            return Objects.isNull(cs);
        } else {
            return subject.equals(cs);
        }
    }
}
