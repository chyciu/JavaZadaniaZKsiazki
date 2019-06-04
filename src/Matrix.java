import java.util.Random;

public class Matrix {

    public void wczytajDane (double[][] tab, int size) {

        Random rand = new Random();

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                if (i == j)
                    tab[i][j] = Math.round(9 * rand.nextDouble());
                else
                    tab [i][j] = 0;
            }
        }

    }

    public void przetworzDane (double [][] tab, int size) {

        double sum = 0;

        for (int i = 0; i < size ; i++) {
            sum += tab [i][i];

            System.out.println("Suma elementów znajdujących się na przekątnej wynosi: " + (int) sum
            + ".");

        }
    }

    public void wyswietlWynik (double [][] tab, int size) {

       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size ; j++)
           {
               System.out.print((int) tab[i][j] + " ");
           }
           System.out.println();
        }
    }

    public static void main(String[] args) {

        int size = 10;
        double [] [] array = new double[size][size];

        Matrix matrix = new Matrix();

        matrix.wczytajDane(array, size);
        matrix.wyswietlWynik(array, size);
        matrix.przetworzDane(array, size);
    }

}
