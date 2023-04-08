package first;
/**
 *Aufgabe 4:
 *
 * Schreiben Sie ein Programm Pi, das eine beliebige positive ganze Zahl n (long)
 * einliest. Anschließend soll der folgende Wert (double)
 * berechnet und ausgegeben werden.
 *
 * @author Dennis Mayer
 * @version 1, 31.10.2022
 **/

public class Pi {
    public static void main(String[] args){
        long n = MyIO.readLong("Gib eine Zahl ein ");
        double ergebnis = 0;

        for(int i = 1; i<=n; i++){
            ergebnis += 6d/(i*i);
        }
        ergebnis = Math.sqrt(ergebnis);
        System.out.println(ergebnis);
    }
}
