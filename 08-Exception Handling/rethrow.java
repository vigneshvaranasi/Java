
class throwDemo{
    public throwDemo(){
        try{
            throw new ArithmeticException("This is an exception");
        }
        catch (ArithmeticException ex){
            System.out.println("Caught Arithmetic Exception: " + ex.getMessage());
            throw ex; 
        }
    }
}

public class rethrow {
    public static void main(String[] args) {
        try{
            throwDemo obj=new throwDemo();
        }
        catch(ArithmeticException ex){
            System.out.println("Re Caught the Exception");
        }
    }
}
