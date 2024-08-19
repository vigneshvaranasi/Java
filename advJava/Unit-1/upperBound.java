
// Upper Bound
class UB <T extends Number>{
    private T value;

    public UB(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class upperBound {

    public static void main(String[] args) {
        UB<Integer> i = new UB<>(10);
        System.out.println(i.getValue());
        UB<Double> d = new UB<>(10.5);
        System.out.println(d.getValue());
        // UB<String> s = new UB<>("Hello"); // Compilation Error
    }
    
}
