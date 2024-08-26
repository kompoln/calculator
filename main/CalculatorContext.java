public class CalculatorContext {
    private OperationStrategy strategy;

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        if (strategy == null) {
            throw new IllegalStateException("Operation strategy is not set.");
        }
        ComplexNumber result = strategy.execute(num1, num2);
        Logger.getInstance().log(strategy.getClass().getSimpleName(), result);
        return result;
    }
}

