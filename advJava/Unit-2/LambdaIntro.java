interface MyInterface {
    void message();
}

public class LambdaIntro {
    public static void main(String[] args) {
        MyInterface obj = () -> {
            System.out.println("Hello, World!");
            System.out.println("Good Morning.");
        };
        obj.message();
    }
}
