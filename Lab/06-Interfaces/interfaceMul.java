interface in1{
    void method1();
}
interface in2{
    void method2();
}
class interfaceMul implements in1, in2{
    public void method1(){
        System.out.println("This is method1");
    }
    public void method2(){
        System.out.println("This is method2");
    }
    public static void main(String[] args) {
        interfaceMul obj= new interfaceMul();
        obj.method1();
        obj.method2();
    }
}
