public class Add_n_numbers_Args {
    public static void main(String args[]) 
    {
        int ans=0;
        for(int i=0;i<args.length;i++)
            ans=ans+Integer.parseInt(args[i]);
        System.out.println("The Sum is:"+ans);
    }
}
