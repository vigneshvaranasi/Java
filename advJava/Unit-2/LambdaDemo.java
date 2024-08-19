interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumObj;
        myNumObj = () -> 123.45;
        System.out.println("A fixed value: " + myNumObj.getValue());
        myNumObj = () -> Math.random() * 100;
        System.out.println("A random value: " + myNumObj.getValue());
        System.out.println("Another random value: " + myNumObj.getValue());
    }

}
