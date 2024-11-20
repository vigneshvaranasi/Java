@FunctionalInterface
interface DoubleArrayProcessor {
    double process(double[] array) throws Exception;
}
public class LambdaExceptionDemo {
    public static void main(String[] args) {
        // Lambda expression to calculate the average of an array
        DoubleArrayProcessor averageCalculator = (array) -> {
            if (array.length == 0) {
                throw new Exception("Array cannot be empty");
            }
            double sum = 0;
            for (double value : array) {
                sum += value;
            }
            return sum / array.length;
        };

        try {
            // Example with a non-empty array
            double[] values = {1.0, 2.0, 3.0, 4.0};
            System.out.println("Average: " + averageCalculator.process(values));

            // Example with an empty array (this will throw an exception)
            double[] emptyArray = {};
            System.out.println("Average: " + averageCalculator.process(emptyArray));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}