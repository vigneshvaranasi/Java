
interface in{
    public void fun1();
    public void fun2();
}
abstract class sample implements in{
    public void fun1(){
        System.out.println("This is fun1");
    }
}
class interfaceAbstarct extends sample{
    public void fun2(){
        System.out.println("This is fun2");
    }
    public static void main(String[] args) {
        interfaceAbstarct obj= new interfaceAbstarct();
        obj.fun1();
        obj.fun2();
    }
}
