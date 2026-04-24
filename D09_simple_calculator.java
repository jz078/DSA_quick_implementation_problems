package small_implementation_problems;

public class D09_simple_calculator {
    public static double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Divide by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    public static void main(String[] args) {
        System.out.println(calculate(10, 5, '+')); // 15
    }
}
