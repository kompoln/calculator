public class ComplexCalculatorTest {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(4, 3);
        ComplexNumber num2 = new ComplexNumber(2, -1);

        CalculatorContext calculator = new CalculatorContext();

        // Addition
        calculator.setStrategy(new AdditionStrategy());
        ComplexNumber result = calculator.calculate(num1, num2);
        System.out.println("Addition: " + result);

        // Multiplication
        calculator.setStrategy(new MultiplicationStrategy());
        result = calculator.calculate(num1, num2);
        System.out.println("Multiplication: " + result);

        // Division
        calculator.setStrategy(new DivisionStrategy());
        result = calculator.calculate(num1, num2);
        System.out.println("Division: " + result);
    }
}
