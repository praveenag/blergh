package matcher;

import matcher.constructs.Case;
import matcher.constructs.CaseBuilder;

import java.util.ArrayList;
import java.util.Optional;

public class NumberMatcher {

    private final CaseBuilder caseBuilder = new CaseBuilder();

    public String match(int number) {
        ArrayList<Case> cases = caseBuilder.buildCases();
        for (Case aCase : cases) {
            Optional<String> val = aCase.applyIfPatternMatches(number);
            if (val.isPresent()) {
                return val.get();
            }
        }
        return "blergh";
    }
}
