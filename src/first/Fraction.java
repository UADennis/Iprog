package first;

/**
 *Übungsaufgabe (1  Abgabe)
 * Definieren und implementieren Sie als Subklasse von Number die immutable
 * Klasse Fraction, die den Datentyp "Rationale Zahl" (Bruch mit ganzzahligem
 * Zähler und Nenner = BigInteger) realisiert und das Interface Comparable
 * implementiert. Die Operationen sollen mindestens die Methoden
 * Fraction add (Fraction r)
 * Fraction subtract (Fraction r)
 * Fraction multiply (Fraction r)
 * Fraction divide (Fraction r)
 * public String toString()
 * boolean isInteger() // liefert true  ganze Zahl
 * umfassen, wobei alle Ergebnisse weitgehend gekürzt und normalisiert sind.
 * Konstruktoren mit BigInteger, long, String Argumenten sind sinnvoll.
 * Und getNumerator() und getDenominator() liefern Zähler und Nenner.
 *
 * @author Dennis Mayer, Olexander Cherniaiev
 * @version 1, 12.12.2022
 **/

import java.math.BigInteger;


public class Fraction extends Number implements Comparable<Fraction>{
    
    protected BigInteger numerator;
    protected BigInteger detominator;

    Fraction(BigInteger num, BigInteger det){
        this.numerator = num;
        this.detominator = det;
        reduceNormalize();
    }

    private void reduceNormalize(){
        if(this.detominator.compareTo(BigInteger.ZERO) == -1){
            this.detominator.multiply(BigInteger.ONE.negate());
            this.numerator.multiply(BigInteger.ONE.negate());
        }
        BigInteger temp = numerator;
        this.numerator = numerator.divide(numerator.gcd(detominator));
        this.detominator = detominator.divide(detominator.gcd(temp));
    }

    Fraction(long num, long det){
        this.numerator = BigInteger.valueOf(num);
        this.detominator = BigInteger.valueOf(det);
        reduceNormalize();
    }

    Fraction(String num, String det){
        this.numerator = BigInteger.valueOf(Long.parseLong(num));
        this.detominator = BigInteger.valueOf(Long.parseLong(det));
        reduceNormalize();
    }

    public int intValue(){
        return numerator.divide(detominator).intValue();
    }

    public long longValue(){
        return numerator.divide(detominator).longValue();
    }
    public double doubleValue(){
        return numerator.doubleValue() / detominator.doubleValue();
    }

    public float floatValue(){
        return numerator.floatValue() / detominator.floatValue();
    }

    public BigInteger getNumerator(){
        return this.numerator;
    }
    public BigInteger getDetominator(){
        return this.detominator;    
    }
    public Fraction add(Fraction fract){
        return new Fraction(this.numerator.multiply(fract.detominator).add(fract.numerator.multiply(this.detominator)), this.detominator.multiply(fract.detominator));
    }

    public Fraction subtract(Fraction fract){
        return new Fraction(this.numerator.multiply(fract.detominator).subtract(fract.numerator.multiply(this.detominator)), this.detominator.multiply(fract.detominator));
    }

    public Fraction multiply(Fraction fract){
        return new Fraction(this.numerator.multiply(fract.numerator), this.detominator.multiply(fract.detominator));
    }

    public Fraction divide(Fraction fract){
        return new Fraction(this.numerator.multiply(fract.detominator), this.detominator.multiply(fract.numerator));
    }
    public boolean lessThan(Fraction fract){
        return this.numerator.multiply(fract.detominator).compareTo(fract.numerator.multiply(this.detominator)) == -1;
    }
    public boolean moreThan(Fraction fract){
        return this.numerator.multiply(fract.detominator).compareTo(fract.numerator.multiply(this.detominator)) == 1;
    }
    public boolean equal(Fraction fract){
        return this.numerator.multiply(fract.detominator).compareTo(fract.numerator.multiply(this.detominator)) == 0;
    }
    public boolean notEqual(Fraction fract){
        return this.numerator.multiply(fract.detominator).compareTo(fract.numerator.multiply(this.detominator)) != 0;
    }

    public boolean isInteger(){
        return this.detominator.equals(BigInteger.ONE);
    }
    public String toString(){
        return this.detominator.equals(BigInteger.ONE) ? this.numerator + "" : this.numerator + "/" + this.detominator;
    }

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

            for (Fraction fraction : arr) {
                System.out.println(fraction.toString() + " ");
            }
            System.out.println(arr[6].intValue());
            System.out.println(arr[6].doubleValue());
            System.out.println(arr[6].floatValue());
            System.out.println(arr[6].longValue());
            System.out.println(arr[8].toString() + " + " + arr[12] + " = " + arr[8].add(arr[12]));
            System.out.println(arr[8].toString() + " - " + arr[12] + " = " + arr[8].subtract(arr[12]));
            System.out.println(arr[8].toString() + " * " + arr[12] + " = " + arr[8].multiply(arr[12]));
            System.out.println(arr[8].toString() + " / " + arr[12] + " = " + arr[8].divide(arr[12]));
    }

    @Override
    public int compareTo(Fraction o) {
        return Double.compare(this.doubleValue(), o.doubleValue());
    }
}
