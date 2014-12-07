package matcher.result;

public class SuccessfulExecution implements ExecutionResult {

    public SuccessfulExecution() {
    }

    @Override
    public Boolean isSuccess() {
        return true;
    }
}
