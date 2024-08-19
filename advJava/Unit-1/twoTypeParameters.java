// Generic class with two type parameters
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String toString() {
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }
}

public class twoTypeParameters {
    public static void main(String[] args) {
        // Creating a Pair of String and Integer
        Pair<String, Integer> p1 = new Pair<>("Age", 19);
        System.out.println(p1);
        System.out.println(p1.getKey() + " : " + p1.getValue());
        p1.setKey("Rank");
        p1.setValue(1);
        System.out.println(p1.getKey() + " : " + p1.getValue());

        // Creating a Pair of Integer and String
        Pair<Integer, String> p2 = new Pair<>(9, "Vignesh Varanasi");
        System.out.println(p2);

        // Creating a Pair of Double and Boolean
        Pair<Double, Boolean> p3 = new Pair<>(99.99, true);
        System.out.println(p3);
    }
}
