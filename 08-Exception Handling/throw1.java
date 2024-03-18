public class throw1 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("This is an exception");
        }
        catch (ArithmeticException ex){
            System.out.println("Caught Arithmetic Exception: " + ex.getMessage());
        }
    }
}
