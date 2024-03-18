public class nestedTryBlock {
    public static void main(String[] args) {
        try{
            int a=9/3;
            try{
                int arr[]={1,2,3};
                arr[9]=9;
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
            }
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
