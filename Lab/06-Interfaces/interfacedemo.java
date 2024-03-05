interface in{
    public void add(int a,int b);
}
class interfacedemo{
    public void add(int a,int b)
    {
        System.out.println("The Sum is:"+a+b);
    }
    public static void main(String[] args) {
        interfacedemo obj= new interfacedemo();
        obj.add(1,8);
    }
}
