package matcher.constructs;

import matcher.result.ExecutionResult;
import matcher.result.FailedExecution;
import matcher.result.SuccessfulExecution;

import java.util.Optional;
import java.util.function.Function;

class When {

    private Function<Integer, Boolean> cond;

    When(Function<Integer, Boolean> cond) {
        this.cond = cond;
    }

    public Optional<Boolean> canApply(Integer number) {
        if (cond.apply(number)) {
            return Optional.of(true);
        } else {
            return Optional.empty();
        }
    }
}
