public class nestedTryBlock {
    public static void main(String[] args) {
        try{
            try{
                int arr[]={1,2,3};
                arr[9]=9;
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
            }
            int a=9/0;
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
