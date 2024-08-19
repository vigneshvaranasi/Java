import java.util.ArrayList;
import java.util.List;

// Base class
class NumberBase {
    // Base class to represent a generic type of number
}
// Subclasses representing specific types of numbers
class IntegerNumber extends NumberBase {
    private int value;
    public IntegerNumber(int value) {
        this.value = value;
    }
    public String toString() {
        return Integer.toString(value);
    }
}

class DoubleNumber extends NumberBase {
    private double value;
    public DoubleNumber(double value) {
        this.value = value;
    }
    public String toString() {
        return Double.toString(value);
    }
}

// Class using a lower bound (List<? super Integer>)
public class LowerBoundExample {

    // Method that accepts a list of NumberBase or any supertype of NumberBase
    public static void addNumbers(List<? super IntegerNumber> list) {
        list.add(new IntegerNumber(1));
        list.add(new IntegerNumber(2));
        list.add(new IntegerNumber(3));
        // list.add(new DoubleNumber(4.0));
        // Note: We cannot add DoubleNumber to this list, as it is not a subtype of IntegerNumber
    }

    public static void main(String[] args) {
        // List of NumberBase (supertype of IntegerNumber)
        List<NumberBase> numberBaseList = new ArrayList<>();
        addNumbers(numberBaseList);
        System.out.println("Number Base List: " + numberBaseList);

        // List of Object (supertype of NumberBase)
        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);
        System.out.println("Object List: " + objectList);
    }
}
