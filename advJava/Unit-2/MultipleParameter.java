interface MyInterface {
    void message(String name, char symbol);
}

public class MultipleParameter {
    public static void main(String[] args) {

        String name = "Vignesh";
        char symbol = '!';

        MyInterface obj = (n,sym) -> {
            System.out.println("Hello, "+n+sym);
        };
        obj.message(name,symbol);
    }
}
