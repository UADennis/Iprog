package first;
/**
 *Aufgabe 3:
 *
 * Schreiben Sie ein Programm WordLcm, das beliebig viele Zahlwörter (also
 * Strings) - eins, zwei, drei, vier, ..., neunundzwanzig - lesen kann und nach
 * Eingabe des leeren Strings ihr kgV korrekt als Zahl ausgibt.
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 07.11.2022
 **/
import java.util.ArrayList;

public class WordLcm {

    public static int stringToInt(String s) {
        int ergebnis;
        switch (s) {
            case "null":
                ergebnis = 0;
                break;
            case "eins":
                ergebnis = 1;
                break;
            case "zwei":
                ergebnis = 2;
                break;
            case "drei":
                ergebnis = 3;
                break;
            case "vier":
                ergebnis = 4;
                break;
            case "fünf":
                ergebnis = 5;
                break;
            case "sechs":
                ergebnis = 6;
                break;
            case "sieben":
                ergebnis = 7;
                break;
            case "acht":
                ergebnis = 8;
                break;
            case "neun":
                ergebnis = 9;
                break;
            case "zehn":
                ergebnis = 10;
                break;
            case "elf":
                ergebnis = 11;
                break;
            case "zwölf":
                ergebnis = 12;
                break;
            case "dreizehn":
                ergebnis = 13;
                break;
            case "vierzehn":
                ergebnis = 14;
                break;
            case "fünfzehn":
                ergebnis = 15;
                break;
            case "sechszehn":
                ergebnis = 16;
                break;
            case "siebzehn":
                ergebnis = 17;
                break;
            case "achtzehn":
                ergebnis = 18;
                break;
            case "neunzehn":
                ergebnis = 19;
                break;
            case "zwanzig":
                ergebnis = 20;
                break;
            case "einsundzwanzig":
                ergebnis = 21;
                break;
            case "zweiundzwanzig":
                ergebnis = 22;
                break;
            case "dreiundzwanzig":
                ergebnis = 23;
                break;
            case "vierundzwanzig":
                ergebnis = 24;
                break;
            case "fünfundzwanzig":
                ergebnis = 25;
                break;
            case "sechsundzwanzig":
                ergebnis = 26;
                break;
            case "siebenundzwanzig":
                ergebnis = 27;
                break;
            case "achtundzwanzig":
                ergebnis = 28;
                break;
            case "neunundzwanzig":
                ergebnis = 29;
                break;
            default:
                ergebnis = -1;
        }
        return ergebnis;
    }

    public static int ggT(int x, int y) {
        return x % y == 0 ? Math.abs(y) : ggT(Math.abs(y), Math.abs(x % y));
    }

    public static int kgV(int x, int y) {
        return (x * y) / ggT(x, y);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            String s = MyIO.promptAndRead("Gib ein Zahl ein: (\"stop\" Um das Programm zu beenden): ");

            if (s.equalsIgnoreCase("stop"))
                break;

            if (stringToInt(s) == -1) {
                System.out.println("Erorr.");
                continue;
            }

            list.add(stringToInt(s));
        }
        int result = kgV(list.get(0), list.get(1));
        for (int number : list)
            result = kgV(number, result);

        System.out.println("kgV von diesen Zahlen(" + list.toString() + "): " + result);
    }
}
