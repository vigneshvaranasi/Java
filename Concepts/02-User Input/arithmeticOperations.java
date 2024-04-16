import java.util.Scanner;
public class arithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = scanner.nextInt();
        System.out.println("The sum of the two numbers is: " + (num1 + num2));
        System.out.println("The difference of the two numbers is: " + (num1 - num2));
        System.out.println("The product of the two numbers is: " + (num1 * num2));
        System.out.println("The quotient of the two numbers is: " + (num1 / num2));
        System.out.println("The remainder of the two numbers is: " + (num1 % num2));

        scanner.close();
    }
}
