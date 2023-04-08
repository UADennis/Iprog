package first;
/**
 *Aufgabe 6:
 *
 * Erweitern Sie die vorhandene Klasse MyMath um Methoden zur Berechnung des
 * Minimums und des Maximums von beliebig vielen Argumenten, die alle vom
 * gleichen Typ sind (int, long, float, double). Die mitgelieferte main-Methode soll
 * Tests aller neuen Methoden (für verschiedene Typen und Argumentanzahlen)
 * enthalten.
 *
 * @author Dennis Mayer
 * @version 2, 31.10.2022
 **/


import java.io.IOException;

public class MyMath {
    public static void main(String[] arg) throws IOException {
        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        long[] longs = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        double[] doubles = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        float[] floats = {1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f,};

        System.out.println("Die Summe aus " + catAll(ints) + " = " + addAll(ints));
        System.out.println("Das Produkt von " + catAll(longs) + " = " + multiplyAll(longs));

        // Größter Wert
        MyIO.writeln(""+ max(ints));
        MyIO.writeln(""+ max(longs));
        MyIO.writeln(""+ max(doubles));
        MyIO.writeln(""+ max(floats));
        // Kleinster Wert
        MyIO.writeln(""+ min(ints));
        MyIO.writeln(""+ min(longs));
        MyIO.writeln(""+ min(doubles));
        MyIO.writeln(""+ min(floats));

        System.out.println(isPrime(15));  // Hier wird die Zahl 15 auf Primzahl geprüft @authors Olexander Cherniaiev, Dennis Mayer
        System.out.println(nextPrime(200)); // Hier wird die nächste Primzahl nach 200 geprüft @authors Olexander Cherniaiev, Dennis Mayer


    }

    public static int addAll(int... x) {
        int s = 0;
        for(int i : x) {
            s+=i;
        }
        return s;
    }
    public static long addAll(long... x) {
        long s = 0;
        for(long i : x) {
            s+=i;
        }
        return s;
}
    public static double addAll(double... x) {
        int s = 0;
        for(double i : x) {
            s+=i;
        }
        return s;
    }
    public static int multiplyAll(int... x){
        int s = 1;
        for (int i : x){
            s*=i;
        }
        return s;
    }
    public static long multiplyAll(long... x){
        long s = 1;
        for (long i : x){
            s*=i;
        }
        return s;
    }
    public static double multiplyAll(double... x) {
        long s = 1;
        for (double i : x) {
            s *= i;
        }
        return s;
    }
    public static String catAll(int... x) {
    String s = x.length == 0 ? "[" : "["+x[0];
    for (int i=1; i< x.length; i++) {
        s+="," + x[i];
    }
    return s+"]";
    }


    public static String catAll(long... x) {
        String s = x.length == 0 ? "[" : "["+x[0];
        for (int i=1; i< x.length; i++) {
            s+="," + x[i];
        }
        return s+"]";
    }
    public static String catAll(double... x) {
        String s = x.length == 0 ? "[" : "[]" + x[0];
        for (int i = 1; i < x.length; i++) {
            s+="," + x[i];
        }
        return s+"]";
    }
    public static int max(int... x) {
        int m = Integer.MIN_VALUE;
        for (int i : x) {
            m = m <= i ? i : m;
        }
        return m;
    }

    public static long max(long... x) {
        long m = Long.MIN_VALUE;
        for (long i : x) {
            m = m <= i ? i : m;
        }
        return m;
    }

    public static float max(float... x) {
        float m = Float.MIN_VALUE;
        for (float i : x) {
            m = m <= i ? i : m;
        }
        return m;
    }

    public static double max(double... x) {
        double m = Double.MIN_VALUE;
        for (double i : x) {
            m = m <= i ? i : m;
        }
        return m;
    }

    public static int min(int... x) {
        int m = Integer.MAX_VALUE;
        for (int i : x) {
            m = m >= i ? i : m;
        }
        return m;
    }

    public static long min(long... x) {
        long m = Long.MAX_VALUE;
        for (long i : x) {
            m = m >= i ? i : m;
        }
        return m;
    }
    /**
     *Aufgabe 6:
     *
     * Erweitern Sie ihre Klasse MyMath, um die Methode
     * static boolean isPrime (long n)
     * die korrekt bestimmt, ob es sich bei n um eine Primzahl handelt oder nicht.
     * Die Methode
     * static long nextPrime (long n)
     * bestimmt die nächstgrößere Primzahl nach n.
     * Die main Methode soll (kommentierte) Tests beider Methoden enthalten.
     *
     * @author Olexander Cherniaiev, Dennis Mayer
     * @version 3, 07.11.2022
     **/
    public static float min(float... x) {
        float m = Float.MAX_VALUE;
        for (float i : x) {
            m = m >= i ? i : m;
        }
        return m;
    }

    public static double min(double... x) {
        double m = Double.MAX_VALUE;
        for (double i : x) {
            m = m >= i ? i : m;
        }
        return m;
    }
    public static boolean isPrime(long n){
        for(int i = 2; i < n/2; i++)
            if(n % i == 0)
                return false;
        return true;
    }

    public static long nextPrime(long n){
        long result = n + 1;
        while(!isPrime(result)){
            result++;
        }
        return result;
    }
    }

