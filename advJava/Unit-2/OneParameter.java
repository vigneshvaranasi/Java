interface MyInterface {
    void message(String name);
}

public class OneParameter {
    public static void main(String[] args) {

        String name = "Vignesh";

        MyInterface obj = (x) -> {
            System.out.println("Hello, "+x);
        };

        // without using lambda expression
        // MyInterface obj = new MyInterface() {
        //     public void message(String name) {
        //         System.out.println("Hello, "+name);
        //     }
        // };
        obj.message(name);
    }
}
