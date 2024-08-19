@FunctionalInterface
interface Operation<T> {
    T fun(T t);
}
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Lambda to reverse a string
        Operation<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("The reverse of 'lambda' is: " + reverse.fun("lambda"));

        // Lambda to calculate the factorial of a number
        Operation<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = result * i;
            return result;
        };
        System.out.println("The factorial of 5 is: " + factorial.fun(5));
    }
}
