package first;
/**
 *Aufgabe 3:
 *
 * Schreiben Sie ein Programm Ggt, welches den größten gemeinsamen Teiler (ggT)
 * zweier eingelesener positiver Zahlen x und y bestimmt und kommentiert ausgibt.
 * Dies soll wiederholt werden, bis eine leere Eingabe erfolgt.
 * Hinweis: Der ggT von x und y ist gleich x, wenn y gleich 0 ist.
 * Andernfalls ist der ggT gleich dem ggT von y und dem Rest der ganzzahligen
 * Division von x durch y. (Rekursive Lösung)
 *
 * @author Dennis Mayer
 * @version 1, 24.10.2022
 **/

public class Ggt {
    public static void main(String[] args) {
        while (true) {
            String zahl1 = MyIO.promptAndRead("Bitte geben sie die erste Zahl ein: ");
            if (zahl1.equals("")) return;

            String zahl2 = MyIO.promptAndRead("Bitte geben sie die zweite Zahl ein: ");
            if (zahl2.equals("")) return;


            System.out.println("Der größte gemeinsame Teiler ist: " + ggT(Integer.parseInt(zahl1), Integer.parseInt(zahl2)));

        }
    }

    public static int ggT(int x, int y) {
        return y == 0 ? x : ggT(y, x % y);

    }


}
