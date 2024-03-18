public class throwsDemo {
    public throwsDemo() throws ArithmeticException
    {
        System.out.println("Caught in constructor");
        throw  new ArithmeticException("This is an Exception");  
    }
    public static void main(String[] args) {
        try {
            throwsDemo obj = new throwsDemo();
        } 
        catch (ArithmeticException ex) {
            System.out.println("Caught in main");
            System.out.println(ex.getMessage());
        }
    }
}
