import java.util.Arrays;

class MyArrayList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void addElement(T item) {
        ensureCapacity();
        elements[size++] = item;
    }

    public int getSize() {
        return size;
    }

    public T getElement(int index) {
        if (index >= 0 && index < size) {
            return (T) elements[index];
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public void setElement(int index, T item) {
        if (index >= 0 && index < size) {
            elements[index] = item;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void removeElement(T item) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(item)) {
                removeAt(i);
                return;
            }
        }
        throw new RuntimeException("Element not found in the list");
    }

    private void removeAt(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class DynamicArray {
    public static void main(String[] args) {
        MyArrayList<Integer> intLst = new MyArrayList<>();
        intLst.addElement(20);
        intLst.addElement(30);
        intLst.addElement(40);
        intLst.removeElement(30);
        intLst.printArray(); // prints [20, 40]

        MyArrayList<Double> dLst = new MyArrayList<>();
        dLst.addElement(10.5);
        dLst.addElement(2.3);
        dLst.addElement(6.4);
        try {
            dLst.removeElement(3.5); // raises a run-time error as element is not present
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        dLst.printArray(); // prints [10.5, 2.3, 6.4]

        MyArrayList<String> sLst = new MyArrayList<>();
        sLst.addElement("Hello");
        sLst.addElement("Java");
        sLst.addElement("Programming");
        sLst.setElement(1, "Generic");
        sLst.printArray(); // prints ["Hello", "Generic", "Programming"]
    }
}
