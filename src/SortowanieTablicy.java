import java.util.Random;

public class SortowanieTablicy {

    public void wczytajDane (int [] array, int size) {

        Random rand = new Random();

        System.out.println("Nieposortowana tablica to: ");

        for (int i = 0; i < size ; i++) {
            array [i] = rand.nextInt(100);

            if (i < size-1)
                System.out.print(array[i]+ ", ");
            else
                System.out.print(array[i] + ".");
        }
        System.out.println();
    }


    public void przetworzDane (int [] array, int size) {

        for (int i = 1;  i < size; i++) {
            for (int j = size-1;  j >= i; j--) {
                if (array[j-1] > array [j])
                {
                    int temp = array[j-1];
                    array[j-1] = array [j];
                    array[j] = temp;
                }
             }
         }
    }

    public void wyswietlWynik (int [] array, int size) {

        System.out.println("Posortowana tablica to: ");

        for (int i = 0; i < size ; i++) {
            if (i < size-1)
                System.out.print(array[i]+ ", ");
            else
                System.out.print(array[i] + ".");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        SortowanieTablicy sortowanie = new SortowanieTablicy();

        int size = 10;
        int[] tab = new int [size];

        sortowanie.wczytajDane(tab, size);
        sortowanie.przetworzDane(tab, size);
        sortowanie.wyswietlWynik(tab, size);
    }

}
