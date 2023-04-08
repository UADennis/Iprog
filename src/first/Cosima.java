package first;
/**
 *Schreiben Sie ein ein interaktives Programm Cosima, das Folgendes leistet:
 * 1. Der Benutzer wird aufgefordert, eine nichtnegative Zahl n (Typ int) einzugeben.
 * 2. Das Programm gibt dann alle Zahlen von 0 bis n hintereinander auf den
 * Bildschirm aus, doch bei Vielfachen von 2 wird statt der Zahl Cos und bei
 * Vielfachen von 3 wird statt der Zahl Sin und bei Vielfachen von 5 wird statt
 * der Zahl Math ausgegeben. Doch bei Zahlen, die ein Vielfaches von genau
 * zwei der drei Zahlen 2, 3, 5 sind, wird statt der Zahl Secans ausgegeben, und
 * bei Vielfachen aller drei wird Cyber ausgegeben.
 * (Beginn einer Ausgabe ist dann etwa: Cyber 1 Cos Sin Cos Math Secans 7 Cos
 * Sin Secans 11 Secans 13 Cos Secans Cos 17 Secans …)
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 05.12.2022
 **/

public class Cosima {
    public static void main(String[] args) {
        int eingabe = MyIO.readInt("Bitte geben sie eine Positive Ganzzahl ein: ");
        for (int i = 0; i <= eingabe; i++) {
            String result = "";
            if (i % 2 == 0) {
                result += "Cos";
            }
            if (i % 3 == 0) {
                result += "Sin";
            }
            if (i % 5 == 0) {
                result += "Math";
            }
            if (result.equals("CosSin") || result.equals("SinMath") || result.equals("CosMath")) {
                result = "Secans";
            }
            if (result.equals("CosSinMath")) {
                result = "Cyber";
            }
            System.out.print(" " + (result.equals("") ? i : result));
        }
    }
}



