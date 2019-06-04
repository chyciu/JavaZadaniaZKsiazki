import java.util.Scanner;

public class PolaFigur {

    int bokA, bokB, bokC;
    int poleProstokata, obwodTrojkata;

    public void wczytajDane () {

        Scanner dane = new Scanner(System.in);

        System.out.println("Program oblicza pole prostokąta, którego boki to A oraz B");
        System.out.println("Następnie program oblicza obwód trójkata, którego boki to A, B i C");
        System.out.println();
        System.out.println("Podaj wartość dla boku A");
        bokA = dane.nextInt();

        System.out.println("Podaj wartość dla boku B");
        bokB = dane.nextInt();

        System.out.println("Podaj wartość dla boku C");
        bokC = dane.nextInt();

        System.out.println("Bok A = " + bokA);
        System.out.println("Bok B = " + bokB);
        System.out.println("Bok C = " + bokC);

    }

    public void obliczenia () {

        poleProstokata = bokA * bokB;
        obwodTrojkata = bokA + bokB + bokC;
    }

    public void wyniki () {

        System.out.println("Pole prostokąta wynosi: "+ poleProstokata);
        System.out.println("Obwód trójkąta wynosi: " + obwodTrojkata);
    }

    public static void main(String[] args) {

        PolaFigur polaFigur = new PolaFigur();

        polaFigur.wczytajDane();
        polaFigur.obliczenia();
        polaFigur.wyniki();
    }

}
