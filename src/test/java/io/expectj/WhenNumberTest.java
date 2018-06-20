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
    public void shouldPass_WhenNumberIsLowerThenMin() {

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
    public void shouldThrowException_WhenNumberIsLowerThanMin() {

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
    public void shouldPass_WhenNumberIsNotLowerThan() {

        // given
        final Number subject = 50;

        // when
        when(subject).isLowerThan(0).thenThrow(IllegalArgumentException::new);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNumberIsLowerThanOrEqualTo() {

        // given
        final Number subject = 50;

        // when
        when(subject).isLowerThanOrEqualTo(50).thenThrow(IllegalArgumentException::new);
    }

    @Test
    public void shouldPass_WhenNumberIsNeitherLowerThanOrEqualTo() {

        // given
        final Number subject = 50;

        // when
        when(subject).isLowerThanOrEqualTo(0).thenThrow(IllegalArgumentException::new);
    }

}
