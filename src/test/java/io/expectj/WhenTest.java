package io.expectj;

import org.junit.Test;

import static io.expectj.When.when;

public class WhenTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsNotNull() {

        // given
        final Object subject = new Object();

        // when
        when(subject).isNotNull().thenThrow(IllegalArgumentException::new);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenSubjectIsNull() {

        // given
        final Object subject = null;

        // when
        when(subject).isNull().thenThrow(IllegalArgumentException::new);

    }
}
