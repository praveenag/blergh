package matcher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberMatcherTest {

    private final NumberMatcher numberMatcher = new NumberMatcher();

    @Test
    public void shouldPrintYayIfPositive() {
        String actual = numberMatcher.match(new Integer(1));
        assertEquals("yay", actual);
    }

    @Test
    public void shouldPrintNayIfNegative() {
        String actual = numberMatcher.match(new Integer(-1));
        assertEquals("nay", actual);
    }

    @Test
    public void shouldPrintBlerghIfZero() {
        String actual = numberMatcher.match(new Integer(0));
        assertEquals("blergh", actual);
    }

    @Test
    public void sneakyTests() throws Exception {
        NumberMatcher numberMatcher = new NumberMatcher();
        String actual = numberMatcher.match(null);
        assertEquals("blergh", actual);
    }
}