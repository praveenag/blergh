package matcher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberMatcherTest {

    private final NumberMatcher numberMatcher = new NumberMatcher();

    @Test
    public void shouldPrintYayIfPositive() {
        assertEquals("yay", numberMatcher.recursiveMatch(new Integer(1)));
        assertEquals("yay", numberMatcher.iterativeMatch(new Integer(1)));
    }

    @Test
    public void shouldPrintNayIfNegative() {
        assertEquals("nay", numberMatcher.recursiveMatch(new Integer(-1)));
        assertEquals("nay", numberMatcher.iterativeMatch(new Integer(-1)));
    }

    @Test
    public void shouldPrintBlerghIfZero() {
        assertEquals("blergh", numberMatcher.recursiveMatch(new Integer(0)));
        assertEquals("blergh", numberMatcher.iterativeMatch(new Integer(0)));
    }

    @Test
    public void nullShouldPrintAsBlergh() throws Exception {
        assertEquals("blergh", numberMatcher.recursiveMatch(null));
        assertEquals("blergh", numberMatcher.iterativeMatch(null));
    }
}