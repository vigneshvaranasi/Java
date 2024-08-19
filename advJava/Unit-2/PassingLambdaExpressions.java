@FunctionalInterface
interface IntegerMath {
    int operation(int a, int b);
}

public class PassingLambdaExpressions {
    public static int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        // Define lambda expressions for various operations
        IntegerMath add = (a, b) -> a + b;
        IntegerMath subtract = (a, b) -> a - b;
        IntegerMath multiply = (a, b) -> a * b;
        IntegerMath divide = (a, b) -> a / b;

        // Use the lambda expressions with the operateBinary method
        System.out.println("40 + 2 = " + operateBinary(40, 2, add));
        System.out.println("20 - 10 = " + operateBinary(20, 10, subtract));
        System.out.println("20 * 10 = " + operateBinary(20, 10, multiply));
        System.out.println("20 / 10 = " + operateBinary(20, 10, divide));
    }
}
