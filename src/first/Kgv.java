package first;
/**
 *Aufgabe 3:
 *
 * Schreiben Sie ein Programm Kgv, das zwei beliebig große Zahlen (BigInteger) x
 * und y kommentiert einliest und anschließend sowohl das kleinste gemeinsame
 * Vielfache (kgV) von x und y als auch den Rest bei der Division von x durch y
 * korrekt berechnet und kommentiert ausgibt.
 * Hinweis: kgV(x,y) = x*y/ggT(x,y)
 *
 * @author Dennis Mayer
 * @version 1, 31.10.2022
 **/

import java.math.BigInteger;

public class Kgv {
    public static BigInteger kgV(BigInteger x, BigInteger y){
        return (x.multiply(y)).divide(x.gcd(y));
    }
    public static void main(String[] args) {
        BigInteger x = MyIO.readBigInt("Geben sie bitte die erste Zahl ein:");
        BigInteger y = MyIO.readBigInt("Geben sie bitte die zweite Zahl:");
        System.out.println("Das kleinste gemeinsame vielfache ist: " + kgV(x,y) + " Der Rest ist: " + x.mod(y));
    }
}
