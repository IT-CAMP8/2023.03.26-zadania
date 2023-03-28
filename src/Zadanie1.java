public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[20];

        /*for(int i = 0; i < tab.length; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }*/

        for(int i = 0; i < tab.length; i++) {
            tab[i] = (i + 1) * 2;
        }

        for(int element : tab) {
            System.out.println(element);
        }
    }
}
