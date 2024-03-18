public class multipleCatchBlocks {
    
    public static void main(String[] args) {
        try{
            int a=9/0;
            int arr[]={1,2,3};
            arr[9]=9;
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
