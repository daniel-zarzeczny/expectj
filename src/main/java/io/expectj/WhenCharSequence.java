package io.expectj;

import com.google.common.collect.Lists;
import io.expectj.predicate.text.*;

import java.util.List;

public class WhenCharSequence extends When<CharSequence> {

    WhenCharSequence(final CharSequence subject) {
        super(subject);
    }

    public WhenThrow<CharSequence> isEqualTo(final CharSequence cs) {
        return is(new EqualToPredicate(cs));
    }

    public WhenThrow<CharSequence> isNotEqualTo(final CharSequence cs) {
        return isNot(new EqualToPredicate(cs));
    }

    public WhenThrow<CharSequence> isBlank() {
        return is(BlankPredicate::new);
    }

    public WhenThrow<CharSequence> isNotBlank() {
        return isNot(BlankPredicate::new);
    }

    public WhenThrow<CharSequence> hasLength(final int length) {
        return is(new LengthEqualToPredicate(length));
    }

    public WhenThrow<CharSequence> hasNotLength(final int length) {
        return isNot(new LengthEqualToPredicate(length));
    }

    public WhenThrow<CharSequence> hasLengthBetween(final int minLengthInclusive, final int maxLengthExclusive) {
        return is(new LengthBetweenPredicate(minLengthInclusive, maxLengthExclusive));
    }

    public WhenThrow<CharSequence> hasNotLengthBetween(final int minLengthInclusive, final int maxLengthExclusive) {
        return isNot(new LengthBetweenPredicate(minLengthInclusive, maxLengthExclusive));
    }

    public WhenThrow<CharSequence> in(final List<CharSequence> args) {
        return is(new InPredicate(args));
    }

    public WhenThrow<CharSequence> in(final CharSequence first, final CharSequence... others) {
        final List<CharSequence> charSequences = wrap(first, others);
        return in(charSequences);
    }

    public WhenThrow<CharSequence> notIn(final List<CharSequence> args) {
        return isNot(new InPredicate(args));
    }

    public WhenThrow<CharSequence> notIn(final CharSequence first, final CharSequence... others) {
        final List<CharSequence> charSequences = wrap(first, others);
        return notIn(charSequences);
    }

    private List<CharSequence> wrap(final CharSequence cs, final CharSequence[] args) {
        final List<CharSequence> charSequences = Lists.newArrayList(args);
        charSequences.add(cs);
        return charSequences;
    }

    public WhenThrow<CharSequence> startsWith(final CharSequence prefix) {
        return is(new StartsWithPredicate(prefix));
    }

    public WhenThrow<CharSequence> notStartsWith(final CharSequence prefix) {
        return isNot(new StartsWithPredicate(prefix));
    }

    public WhenThrow<CharSequence> endsWith(final CharSequence suffix) {
        return is(new EndsWithPrefix(suffix));
    }

    public WhenThrow<CharSequence> notEndsWith(final CharSequence suffix) {
        return isNot(new EndsWithPrefix(suffix));
    }
}
