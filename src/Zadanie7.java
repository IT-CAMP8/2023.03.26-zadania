import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {
        int w = 20;
        for (int i = 0; i < w; i++) {
            int s = w - 1 - i;
            int g = i * 2 + 1;

            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < g; j++) {
                Random random = new Random();
                int b = random.nextInt(7);
                if(b != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}
