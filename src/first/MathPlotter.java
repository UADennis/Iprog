package first;
/**
 Schreiben Sie unter Verwendung von anonymen Klassen ein interaktives
 Programm MathPlotter, das Folgendes leistet:
 1. Der Benutzer wird aufgefordert, den Namen einer der (in der Klasse Math
 vorhandenen) mathematischen Funktionen sin, cos, exp, log,
 sqrt, tan oder aber square , cube , quad und tower (für die
 Berechnung von Potenzen x^x^x) einzugeben.
 2. Wurde eine Funktion eingegeben, sollen Zahlwerte für Beginn, Schrittweite,
 und Ende erfragt und eingelesen und anschließend die Funktion geplottet
 (ausgegeben) werden.
 3. Danach kann gleich wieder die nächste Funktion geplottet werden (Fortsetzung
 also bei Schritt 1). Nur wenn statt des Funktionsnamens stop eingegeben
 wurde, soll das Programm enden.
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 05.12.2022
 **/

public class MathPlotter {
    public static void main(String[] args) {
        while (true) {
            String funktion = MyIO.promptAndRead("Bitte geben sie eine Funktionsart an: ");
            String[] funktionen = {"sin", "cos", "exp", "log", "sqrt", "tan", "square", "cube", "quad", "tower"};
            boolean contains = false;
            for (String s : funktionen) {
                if (s.equals(funktion)) {
                    contains = true;
                    break;
                }
            }
            if (funktion.equals("stop")) break;
            if (contains) {
                double startwert = MyIO.readDouble("Bitte geben sie den Startwert ein: ");
                double endwert = MyIO.readDouble("Bitte geben sie den Endwert ein: ");
                double schrittweite = MyIO.readDouble("Bitte geben sie die Schrittweite an: ");

                switch (funktion) {
                    case "sin":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.sin(value);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "cos":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.cos(value);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "exp":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.exp(value);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "log":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.log(value);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "sqrt":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.sqrt(value);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "tan":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.tan(value);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "square":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.pow(value,2);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "cube":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.pow(value,3);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "quad":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.pow(value,4);
                            }
                        },startwert,endwert,schrittweite);
                        break;
                    case "tower":
                        plot(new D2Method() {
                            @Override
                            public double compute(double value) {
                                return Math.pow(value, Math.pow(value,value));
                            }
                        },startwert,endwert,schrittweite);
                        break;
                }




            }

        }

    }

    public static void plot(D2Method meth, double startwert, double endwert, double schrittweite) {
        System.out.println("Plot " + meth);
        for (double x = startwert; x <=endwert; x += schrittweite) {
            MyIO.writeln(" " + x + " -> " + meth.compute(x));
        }

    }
}
interface D2Method {
    double compute(double value);
}
