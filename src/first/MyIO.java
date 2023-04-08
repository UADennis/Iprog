package first;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Aufgabe 1:
 * <p>
 * Übersetzen Sie die Klasse MyIO und benutzen Sie diese in den weiteren
 * Aufgaben, wenn nötig
 *
 * @author Dennis Mayer
 * @version 2, 31.10.2022
 **/
public final class MyIO {
    private MyIO() {
    }

    static Scanner scan = new Scanner(System.in);

    public static String promptAndRead(String prompt) {
        try {
            System.out.print(prompt);
            return scan.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            return promptAndRead("Fehler versuchen sie es bitte erneut!");
        }
    }

    public static Double readDouble(String prompt) {
        try {
            System.out.print(prompt);
            return Double.parseDouble(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            return readDouble("Fehler versuchen sie es bitte erneut!");
        }
    }

    public static long readLong(String prompt) {
        try {
            System.out.print(prompt);
            return Long.parseLong(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            return readLong("Fehler versuchen sie es bitte erneut!");
        }
    }

    public static int readInt(String prompt) {
        try {
            System.out.print(prompt);
            return Integer.parseInt(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            return readInt("Fehler versuchen sie es bitte erneut!");
        }
    }

    /**
     * Aufgabe 1)
     * Erweitern Sie die MyIO-Klasse so, dass alle elementaren Zahl-Datentypen und auch
     * BigInteger und BigDecimal (mit Prompt) eingelesen werden können.
     **/

    public static BigInteger readBigInt(String prompt) {
        try {
            System.out.print(prompt);
            return new BigInteger(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            return readBigInt("Fehler versuchen sie es bitte erneut!");
        }
    }

    public static BigDecimal readBigDecimal(String prompt) {
        try {
            System.out.print(prompt);
            return new BigDecimal(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            return readBigDecimal("Fehler versuchen sie es bitte erneut!");
        }
    }


    public static float readFloat(String prompt) {
        try {
            System.out.print(prompt);
            return Float.parseFloat(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            return readFloat("Fehler versuchen sie es bitte erneut!");
        }
    }

    public static Fraction readFraction(String prompt) {
        try {
            System.out.println(prompt);
            int i = Integer.parseInt(scan.nextLine());
            int j = Integer.parseInt(scan.nextLine());
            if (j == 0)
                throw new ArithmeticException();
            return new Fraction(i, j);
        } catch (NumberFormatException | ArithmeticException e) {
            return readFraction("Fehler versuchen sie es bitte erneut!");
        }
    }


    public static void write(String s) {
        System.out.print(s);
    }

    public static void writeln(String s) {
        System.out.println(s);
    }
}
/**
 * Abgabe 07.11.2022
 * Olexander Cherniaev, Dennis Mayer
 **/

/**
 * Abgabe 12.12.2022
 * 1. Ergänzen Sie Ihre Klasse MyIO.java so, dass neben den anderen Datentypen (int, long,
 * …, BigInteger) auch Fractions vom Benutzer über die Tastatur ohne Fehler gelesen
 * werden können.
 * Exceptions werden dabei abgefangen, soweit das möglich ist
 * Version 3.0
 * Olexander Cherniaev, Dennis Mayer
 **/