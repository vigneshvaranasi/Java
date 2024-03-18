public class tryCatchFinally {
    public static void main(String[] args) {
        try{
            int a=9/0;
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Task Completed");
        }
    }
}
