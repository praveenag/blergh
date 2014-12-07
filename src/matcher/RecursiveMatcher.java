package matcher;

import matcher.constructs.Case;

import java.util.List;

public class RecursiveMatcher {

    private List<Case> cases;

    public RecursiveMatcher(List<Case> cases) {
        this.cases = cases;
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

    public String match(Integer number) {
        return recursiveMatch(0, number);
    }
}