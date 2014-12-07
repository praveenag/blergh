package matcher.constructs;

import java.util.ArrayList;
import java.util.function.Supplier;

public class CaseBuilder {

    public ArrayList<Case> buildCases() {
        ArrayList<Case> cases = new ArrayList<>();
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
        return new When((x) -> x < 0);
    }

    private When isPositive() {
        return new When((x) -> x > 0);
    }
}