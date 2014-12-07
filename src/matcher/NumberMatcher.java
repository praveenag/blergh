package matcher;

import matcher.constructs.Case;
import matcher.constructs.CaseBuilder;

import java.util.List;

public class NumberMatcher {

    private List<Case> cases = new CaseBuilder().buildCases();
    private final RecursiveMatcher recursiveMatcher = new RecursiveMatcher(cases);
    private final IterativeMatcher iterativeMatcher = new IterativeMatcher(cases);

    public String match(Integer number) {
//        return iterativeMatcher.match(number);
        return recursiveMatcher.match(number);
    }
}
