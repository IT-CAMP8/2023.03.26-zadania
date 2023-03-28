public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for(int element : tab) {
            if(element % 2 == 0 && element % 5 == 0) {
                System.out.println(element);
            }
        }
    }
}
