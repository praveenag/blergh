package matcher.result;

public class FailedExecution implements ExecutionResult{

    @Override
    public Boolean isSuccess() {
        return false;
    }
}
