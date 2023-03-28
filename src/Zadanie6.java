import java.util.Random;

public class Zadanie6 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random random = new Random();

        for(int row = 0; row < tab.length; row++) {
            for(int col = 0; col < tab[row].length; col++) {
                tab[row][col] = random.nextInt(1001);
                System.out.print(tab[row][col] + " ");
            }
            System.out.println();
        }

        for(int row = 0; row < tab.length; row++) {
            int min = tab[row][0];
            for(int element : tab[row]) {
                if(min > element) {
                    min = element;
                }
            }
            System.out.println("Wiersz " + row + ": " + min);
        }

        /*String s = "khsjgdflkjhgalsdfkjgh";
        int d = s.length();
        System.out.println(d);*/
    }
}
