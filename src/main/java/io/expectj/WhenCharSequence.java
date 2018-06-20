package io.expectj;

import io.expectj.predicate.BlankPredicate;

public class WhenCharSequence extends When<CharSequence> {

    WhenCharSequence(final CharSequence subject) {
        super(subject);
    }

    public WhenThrow<CharSequence> isBlank() {
        return is(BlankPredicate::new);
    }

    public WhenThrow<CharSequence> isNotBlank() {
        return isNot(BlankPredicate::new);
    }
}
