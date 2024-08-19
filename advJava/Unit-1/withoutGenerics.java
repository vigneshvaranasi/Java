// Without Generics Example

// Integer Class
class PrintInteger {
    Integer num;
    PrintInteger(Integer num) {
        this.num = num;
    }
    public void print() {
        System.out.println(num);
    }
}

// Double Class
class PrintDouble {
    Double num;
    PrintDouble(Double num) {
        this.num = num;
    }
    public void print() {
        System.out.println(num);
    }
}

// String Class
class PrintString {
    String str;
    PrintString(String str) {
        this.str = str;
    }
    public void print() {
        System.out.println(str);
    }
}

public class withoutGenerics {
    public static void main(String[] args) {
        PrintInteger p = new PrintInteger(10);
        p.print();
        PrintDouble d = new PrintDouble(10.5);
        d.print();
        PrintString s = new PrintString("Hello");
        s.print();
    }
}
