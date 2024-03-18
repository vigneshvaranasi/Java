
class ownEx extends Exception{
    public ownEx(String s){
        super(s);
    }
}

public class userDefinedEx {
    public static void main(String[] args) {
        try {
            throw new ownEx("This is a custom exception");
        } 
        catch (ownEx ex){
            System.out.println("Caught an OwnException: " + ex.getMessage());
        }
    }
}
