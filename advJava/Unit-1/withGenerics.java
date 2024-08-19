
// With Generics

// Generic Class
class Print <T> {
    T thingToPrint;
    Print(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    public void print() {
        System.out.println(thingToPrint);
    }
}

public class withGenerics {
    public static void main(String[] args) {
        Print <Integer> p = new Print<>(10);
        p.print();        
        Print <Double> d = new Print<>(10.5);
        d.print();
        Print <String> s = new Print<>("Hello");
        s.print();
    }
}
