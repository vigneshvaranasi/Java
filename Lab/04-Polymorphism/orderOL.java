public class orderOL {
    static float sum(int a, int b) {
        return a + b;
    }
    static float sum(int a, float b) {
        return a + b;
    }
    static float sum(float a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum : " + sum(1, 2));
        System.out.println("Sum : " + sum(1, 2.5f));
        System.out.println("Sum : " + sum(1.5f, 2));
    }
}
