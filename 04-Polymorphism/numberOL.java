
public class numberOL {
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }   
    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static void main(String[] args) {
        System.out.println("Sum : " + sum(1, 2));
        System.out.println("Sum : " + sum(1, 2, 3));
        System.out.println("Sum : " + sum(1, 2, 3, 4));
    }
}
