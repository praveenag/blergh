package matcher.constructs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class CaseBuilder {

    public List<Case> buildCases() {
        List<Case> cases = new ArrayList<>();
        cases.add(build(isPositive(), () -> "yay"));
        cases.add(build(isNegative(), () -> "nay"));
        cases.add(build(defaultCondition(), () -> "blergh"));
        return cases;
    }

    private Case build(When when, Supplier<String> chant) {
        return new Case(when, chant);
    }

    private When defaultCondition() {
        return new When((x) -> true);
    }

    private When isNegative() {
        Function<Integer, Boolean> nullSafeNegative = (x) -> {
            if(x == null) {
                return false;
            } else {
                return x < 0;
            }
        };
        return new When(nullSafeNegative);
    }

    private When isPositive() {
        Function<Integer, Boolean> nullSafePositive = (x) -> {
            if(x == null) {
                return false;
            } else {
                return x > 0;
            }
        };
        return new When(nullSafePositive);
    }
}