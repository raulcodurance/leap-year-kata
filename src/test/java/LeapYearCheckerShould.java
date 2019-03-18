import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LeapYearCheckerShould {

    @Test
    public void
    return_false_when_is_not_divisible_by_four() {

        assertThat(LeapYearChecker.check(1981), is(false));
    }

    @Test
    public void
    return_true_when_is_divisible_by_four() {
        assertThat(LeapYearChecker.check(1984), is(true));
    }


    @Test
    public void
    return_true_when_is_divisible_by_400() {
        assertThat(LeapYearChecker.check(1984), is(true));
    }

    @Test
    public void
    return_false_when_is_divisible_by_100_but_not_divisible_by_400() {

        assertThat(LeapYearChecker.check(2100), is(false));
    }
}
