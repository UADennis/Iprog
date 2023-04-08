package first;
/**
 *Aufgabe 4:
 *
 * Schreiben Sie ein Programm FifthRoot, das eine reelle Zahl (double) x
 * kommentiert einliest und dann die fünfte Wurzel aus x berechnet und
 * ausgibt.
 * Bsp.: Für x = -141 ist die fünfte Wurzel etwa -2.690567... .
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 07.11.2022
 **/

public class FifthRoot {
    public static double fifthRoot(double x){
        int n = 1;
        int maxIterations = 1000;
        double maxError = 1e-10;
        double xn = 2.0;
        double xnPlus1 = 1;
        while(Math.abs((xnPlus1 - xn)) >= maxError && n < maxIterations){
            xn = xnPlus1;
            xnPlus1 = xn - (xn*xn*xn*xn*xn - x) / (4*xn*xn*xn*xn);
            MyIO.writeln("n = " + n + ", xnPlus1 = " + xnPlus1);
            n++;
        }
        return xnPlus1;
    }
    public static void main(String[] args) {
        double num = MyIO.readDouble("Gib ein Zahl ein: ");
        MyIO.writeln("Ergebniss ist " + fifthRoot(num));
    }
}
