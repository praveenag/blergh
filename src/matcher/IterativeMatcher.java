package matcher;

import matcher.constructs.Case;

import java.util.List;
import java.util.Optional;

public class IterativeMatcher {

    private List<Case> cases;

    public IterativeMatcher(List<Case> cases) {
        this.cases = cases;
    }

    String match(Integer number) {
        for (Case aCase : cases) {
            Optional<String> val = aCase.applyIfPatternMatches(number);
            if (val.isPresent()) {
                return val.get();
            }
        }
        return "blergh";
    }
}