package matcher;

import matcher.constructs.Case;
import matcher.constructs.CaseBuilder;

import java.util.List;

public class NumberMatcher {

    private List<Case> cases = new CaseBuilder().buildCases();

    public String match(Integer number) {
        return recursiveMatch(0, number);
    }

    private String recursiveMatch(int current, Integer number) {
        if (current == cases.size()) {
            return cases.get(current).applyIfPatternMatches(number).orElse(null);
        } else {
            return cases.get(current)
                    .applyIfPatternMatches(number)
                    .orElseGet(() -> recursiveMatch(current + 1, number));
        }

    }
}
