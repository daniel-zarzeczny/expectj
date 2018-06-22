package io.expectj.predicate.text;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class InPredicate implements Predicate<CharSequence> {

    private List<CharSequence> charSequences;

    public InPredicate(final List<CharSequence> charSequences) {
        this.charSequences = charSequences;
    }

    @Override
    public boolean test(final CharSequence cs) {
        return Objects.nonNull(charSequences) && charSequences.contains(cs);
    }
}
