package first;
/**
 *Aufgabe 5:
 *
 * Schreiben Sie ein Programm Triangle, das Sterne in Form eines Dreiecks (s.u.)
 * ausgibt. Der Anwender gibt nach Aufforderung die Zahl n für die Anzahl der
 * Zeilen ein und das Programm gibt n Zeilen mit Sternen in Dreiecksform aus.
 * Das Beispiele unten ist für n = 7:
 *
 * @author Dennis Mayer
 * @version 1, 31.10.2022
 **/

import com.sun.tools.javac.Main;

public class Triangle {

    public static void writeSpace(int k){
        for(int i = 0; i <= k; i++)
            System.out.print(" ");
    }
    public static int writeStern(int n){
        int stars = 0;
        for(int i = 0; i<= n; i++) {
            System.out.print("* ");
            stars++;

        } return stars;
    }
    //k Anzahl der Leerstellen
    public static void Zeichnen(int n){
        int stars = 0;
        if(n == 0) return;
        for (int i = n-1, k = 0; i >= 0; i--, k++){
            writeSpace(k);
            stars += writeStern(i);
            System.out.println();
        }
        System.out.println("Die Anzahl der Sterne beträgt: " + stars);
        System.out.println("Die Anzahl der Zeilen beträgt: " + n);

    }
    public static void main(String[] args){
        int n = MyIO.readInt("Gib die Anzahl der Reihen ein: ");
        Zeichnen(n);
    }
}
