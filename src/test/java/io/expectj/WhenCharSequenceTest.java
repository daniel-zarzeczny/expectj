package io.expectj;

import org.junit.Test;

import static io.expectj.When.when;

public class WhenCharSequenceTest {

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
}
