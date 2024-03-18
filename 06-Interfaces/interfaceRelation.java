interface in1{
    void method2();
}
interface in2 extends in1{
    void method2();
}
class in implements in2{
    public void method1(){
        System.out.println("This is method1");
    }
    public void method2(){
        System.out.println("This is method2");
    }
}

public class interfaceRelation extends in{
    public static void main(String[] args) {
        interfaceRelation obj = new interfaceRelation();
        obj.method1();
        obj.method2();
    }
}
