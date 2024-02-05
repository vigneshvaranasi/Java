public class Arithmetic_Operations_args {
    public static void main(String args[]) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        String op=args[2];
        switch (op) {
            case "+":
                System.out.println("The Sum of 2 Numbers is:"+(a+b));
                break;
            case "-":
                System.out.println("The Difference of 2 Numbers is:"+(a-b));
                break;
            case "*":
                /*  Give this opeartion as string like this -> 1 2 "*"       */
                System.out.println("The Multiplication of 2 Numbers is:"+(a*b));
                break;
            case "/":
                System.out.println("The Division of 2 Numbers is:"+(a/b));
                break;
            case "%":
                System.out.println("The Mod of 2 Numbers is:"+(a%b));
                break;
                
            default:
                System.out.println("Operation Not Found");
                break;
        }
    }
}
