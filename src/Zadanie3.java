import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random random = new Random();

        //generowanie losowej tablicy
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1001);
        }

        int sum = 0;
        for(int element : tab) {
            sum = sum + element;
        }

        double avr = ((double) sum)/((double) tab.length);
        System.out.println(sum);
        System.out.println(avr);

        /*for(int element : tab) {
            System.out.println(element);
        }*/

        int a = 7,b = 2,c = 11,d = 3,e = 7;

        double wynik = ((double) a) / b + ((double) c) / d + e;
        System.out.println(wynik);
    }
}
