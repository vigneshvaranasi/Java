import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random Integer: " + random.nextInt());
        System.out.println("Random Integer (0-9): " + random.nextInt(10));
        System.out.println("Random Float: " + random.nextFloat());
        System.out.println("Random Double: " + random.nextDouble());
        System.out.println("Random Boolean: " + random.nextBoolean());
        System.out.println("Random Long: " + random.nextLong());
    }
}
// Random Integer: -297016588
// Random Integer (0-9): 3
// Random Float: 0.614591
// Random Double: 0.0350625760803287
// Random Boolean: false
// Random Long: 6154590215021408151