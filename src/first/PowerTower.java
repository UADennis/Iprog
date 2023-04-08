package first;

/**
 *Aufgabe 4:
 *
 * Schreiben Sie ein Programm PowerTower, das Folgendes leistet: Es werden eine
 * reelle Zahl (double) und eine ganze Zahle n (int) kommentiert (also mit Prompt)
 * eingelesen, und dann wird der PowerTower-Funktionswert von x und n ausgegeben:
 * Berechnen Sie z.B. f (0.25, 225) oder f (1.4142, 144) oder f (0.3333, 300).
 * Hinweis: Es gilt f (x, 0) = 1.0 und f (x, n) = xf(x,n-1), wenn n>0.
 * Siehe auch: Math.pow
 *
 * @author Dennis Mayer
 * @version 1, 24.10.2022
 **/


public class PowerTower {
    public static void main(String[] args) {
        String zahl1 = MyIO.promptAndRead("Geben sie die erste Zahl ein: ");
        String zahl2 = MyIO.promptAndRead("Geben sie nun die Zweite Zahl ein: ");

        System.out.println("Das Ergebnis ist: " + powerTower(Double.parseDouble(zahl1),Integer.parseInt(zahl2)));


    }

    public static double powerTower(double x, int n) {
        return n == 0 ? 1 : Math.pow(x,powerTower(x,n-1));
    }
}
