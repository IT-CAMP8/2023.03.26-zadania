import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random random = new Random();

        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1001);
            System.out.printf("%d ", tab[i]);
        }

        int max = tab[0];
        for(int element : tab) {
            if(element > max) {
                max = element;
            }
        }

        System.out.println();
        System.out.println(max);
    }
}
