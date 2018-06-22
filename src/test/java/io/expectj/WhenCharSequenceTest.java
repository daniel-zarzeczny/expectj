package io.expectj;

import org.junit.Test;

import static io.expectj.When.when;

public class WhenCharSequenceTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsEqualToItself() {

        // given
        final String subject = "a";

        // when
        when(subject).isEqualTo(subject).thenThrow(IllegalArgumentException::new);

    }

    @Test
    public void shouldPass_WhenSubjectIsNotEqualToNull() {

        // given
        final String subject = "a";

        // when
        when(subject).isEqualTo(null).thenThrow(IllegalArgumentException::new);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsNotEqualToItself() {

        // given
        final String subject = "subject";

        // when
        when(subject).isNotEqualTo("not-a-subject").thenThrow(IllegalArgumentException::new);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsBlank() {

        // given
        final String subject = "";

        // when
        when(subject).isBlank().thenThrow(IllegalArgumentException::new);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsNotBlank() {

        // given
        final String subject = "subject";

        // when
        when(subject).isNotBlank().thenThrow(IllegalArgumentException::new);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectHasExpectedLength() {

        // given
        final String subject = "";

        // when
        when(subject).hasLength(0).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectHasNotExpectedLength() {

        // given
        final String subject = "";

        // when
        when(subject).hasNotLength(10).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectHasLengthBetween() {

        // given
        final String subject = "subject";

        // when
        when(subject).hasLengthBetween(0, 10).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectHasNotLengthBetween() {

        // given
        final String subject = "subject";

        // when
        when(subject).hasNotLengthBetween(10, 20).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsIn() {

        // given
        final String subject = "a";

        // when
        when(subject).in("a", "b", "c").thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsNotIn() {

        // given
        final String subject = "subject";

        // when
        when(subject).notIn("a", "b", "c").thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectStartsWith() {

        // given
        final String subject = "subject";

        // when
        when(subject).startsWith("sub").thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectNotStartsWith() {

        // given
        final String subject = "subject";

        // when
        when(subject).notStartsWith("foo").thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectEndsWith() {

        // given
        final String subject = "subject";

        // when
        when(subject).endsWith("ect").thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectNotEndsWith() {

        // given
        final String subject = "subject";

        // when
        when(subject).notEndsWith("foo").thenThrow(IllegalArgumentException::new);
    }
}
