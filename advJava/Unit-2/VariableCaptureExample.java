// Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
    int operate(int x);
}
public class VariableCaptureExample {
    // Instance variable
    private int instanceVar = 10;
    static int staticVar = 30;

    public void demonstrateCapture() {
        // Local variable
        int localVar = 20;

        // Lambda expression capturing instanceVar and localVar
        MyFunctionalInterface myLambda = (x) -> {
            // Capturing instanceVar (allowed)
            System.out.println("Instance Variable: " + instanceVar);

            // Capturing localVar (allowed because it's effectively final)
            System.out.println("Local Variable: " + localVar);

            // Capturing staticVar (allowed)
            System.out.println("Static Variable: " + staticVar);

            instanceVar++;
            staticVar++;

            // localVar++;  Not allowed 

            return x + instanceVar + localVar + staticVar;
        };

        // Executing the lambda expression
        int result = myLambda.operate(5);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        VariableCaptureExample example = new VariableCaptureExample();
        example.demonstrateCapture();
    }
}

