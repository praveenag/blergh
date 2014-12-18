package matcher.constructs;

import java.util.Optional;
import java.util.function.Supplier;

public class Case {
    private final When condition;
    private final Supplier<String> chant;

    public Case(When condition, Supplier<String> chant) {
        this.condition = condition;
        this.chant = chant;
    }

    public Optional<String> applyIfPatternMatches(Integer number) {
        if (condition.canApply(number).isPresent()) {
            return Optional.of(chant.get());
        }
        return Optional.empty();
    }
}