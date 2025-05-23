import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        boolean moeda = random.nextBoolean();
        if (moeda) {
            System.out.println("Cara");
        } else {
            System.out.println("Coroa!");
        }
    }
}
