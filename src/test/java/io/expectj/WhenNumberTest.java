package io.expectj;

import org.junit.Test;

import static io.expectj.When.when;

public class WhenNumberTest {

    @Test
    public void shouldPass_WhenNumberIsNotEqual() {

        // given
        final Number subject = 0;

        // when
        when(subject).isEqualTo(50).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsNotEqual() {

        // given
        final Number subject = 0;

        // when
        when(subject).isNotEqualTo(50).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsEqual() {

        // given
        final Number subject = 0;

        // when
        when(subject).isEqualTo(0).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsBetween() {

        // given
        final Number subject = 50;

        // when
        when(subject).isBetween(0, 100).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsLessThenMin() {

        // given
        final Number subject = -1;

        // when
        when(subject).isBetween(0, 100).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsEqualToMax() {

        // given
        final Number subject = 100;

        // when
        when(subject).isBetween(0, 100).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsEqualMax() {

        // given
        final Number subject = 100;

        // when
        when(subject).isNotBetween(0, 100).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsLessThanMin() {

        // given
        final Number subject = -1;

        // when
        when(subject).isNotBetween(0, 100).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsBetween() {

        // given
        final Number subject = 50;

        // when
        when(subject).isNotBetween(0, 100).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsGreaterThan() {

        // given
        final Number subject = 50;

        // when
        when(subject).isGreaterThan(0).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsNotGreaterThan() {

        // given
        final Number subject = 0;

        // when
        when(subject).isGreaterThan(50).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsGreaterThanOrEqualTo() {

        // given
        final Number subject = 50;

        // when
        when(subject).isGreaterThanOrEqualTo(50).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsNeitherGreaterThanOrEqualTo() {

        // given
        final Number subject = 0;

        // when
        when(subject).isGreaterThanOrEqualTo(50).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsNotLessThan() {

        // given
        final Number subject = 50;

        // when
        when(subject).isLessThan(0).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsLessThanOrEqualTo() {

        // given
        final Number subject = 50;

        // when
        when(subject).isLessThanOrEqualTo(50).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsNeitherLessThanOrEqualTo() {

        // given
        final Number subject = 50;

        // when
        when(subject).isLessThanOrEqualTo(0).thenThrow(IllegalArgumentException::new);
    }

}
