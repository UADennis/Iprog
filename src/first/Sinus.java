package first;
/**
 * Aufgabe 1
 Schreiben Sie ein Programm Sinus, das die sin-Funktion für einen
 eingelesenen x-Wert entsprechend dieser Summe approximiert und ausgibt:
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 07.11.2022
 **/


public class Sinus {

    public static double abs(double x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }


    public static void main(String[] args) {
        double x = MyIO.readDouble("Gib einen x Wert ein: ");
        System.out.println(Sinus.sin(x));

    }
    public static double sin(double x) {

        x = x % 6.283185307179586;
        double b = x;
        double summe = x;
        double letztesB = 0;
        for (int i = 1; abs(abs(b) - abs(letztesB)) > 1e-15; i++) {
            letztesB = b;
            b *= -1 * x * x;
            b /= (2d * (double) i * (2d * (double) i + 1d));
            summe += b;
        }
        return summe;
    }

}
