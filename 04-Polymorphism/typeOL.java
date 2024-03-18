public class typeOL {
    static double sum(int a, int b) {
        return a + b;
    }
    static double sum(int a, double b) {
        return a + b;
    }
    static double sum(float a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum : " + sum(1, 2));
        System.out.println("Sum : " + sum(1, 2.5));
        System.out.println("Sum : " + sum(1.3f, 2));
    }
}
