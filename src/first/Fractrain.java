package first;

import java.math.BigInteger;

/**
 * Schreiben Sie nun ein Programm Fractrain, welches Folgendes macht:
 * Es wird zuerst diese Liste L (ein Array) von 14 Fractions definiert und
 * ausgegeben:
 * [17/91, 78/85, 19/51, 23/38, 29/33, 77/29, 95/23,
 * 77/19, 1/17, 11/13, 13/11, 15/2, 1/7, 55/1]
 * (weiter nächte Folie)
 * Interaktive Programme (Java) Alois Heinz
 * 48
 * Übungsaufgabe (2  Abgabe)
 * Dann wird ein weiterer Bruch b = 8/1 ( = die ganze Zahl 8) definiert,
 * ausgegeben und dann versuchsweise jeweils mit den Brüchen aus der Liste L
 * (von ganz links nach rechts) multipliziert, bis dabei eine ganze Zahl z
 * (Nenner = 1) dabei herauskommt.
 * Diese zweite Zahl z wird ebenfalls ausgegeben und nun b = z gesetzt.
 * Anschließend wird das Ganze wiederholt mit der neuen Zahl b, wobei mit
 * den Multiplikationen von Brüchen aus L wieder ganz links begonnen wird.
 * Lassen Sie ihr Programm die ersten 3825 so gebildeten ganzen Zahlen und
 * die 19200-te Zahl auf den Bildschirm ausgeben! Es werden also ausgegeben:
 * 8, 60, 450, 3375, 185625, 163125, 433125, 380625, 1010625, ...
 * Beantworten Sie mit Ihrer Abgabe unbedingt die folgenden Fragen:
 * Welches ist die 8000-te Zahl?
 * Welches ist die größte Zahl unter den ersten 8000 Zahlen?
 * An welcher Stelle (1, …, 8000) kommt die größte Zahl vor?
 *
 * @author Dennis Mayer, Olexander Cherniaiev
 * @version 1, 21.11.2022
 **/

public class Fractrain {
    public static void main(String[] args) {
        Fraction[] arr = {new Fraction(17, 91),
                new Fraction(78, 85),
                new Fraction(19, 51),
                new Fraction(23, 38),
                new Fraction(29, 33),
                new Fraction(77, 29),
                new Fraction(95, 23),
                new Fraction(77, 19),
                new Fraction(1, 17),
                new Fraction(11, 13),
                new Fraction(13, 11),
                new Fraction(15, 2),
                new Fraction(1, 7),
                new Fraction(55, 1),
                new Fraction(4, 16)};

        Fraction b = new Fraction(8, 1);
        System.out.println("1 = " + b);
        BigInteger großste = BigInteger.ZERO;
        int index = 0;
        for (int i = 2; i <= 19200; i++) {
            for (Fraction fraction : arr) {
                if (b.multiply(fraction).isInteger()) {
                    if (i < 8000 && b.multiply(fraction).getNumerator().compareTo(großste) > 0) {
                        großste = b.multiply(fraction).getNumerator();
                    index = i;
                    }
                    if (i <= 3825 || i == 19200)
                        System.out.println(i + " = " + b.multiply(fraction));
                    b = b.multiply(fraction);
                    break;
                }
            }
        }
        System.out.println("Die gröeßte Zahl ist: " + großste);
        System.out.println("Die größte Zahl ist an der Position: " + index);
    }
}
