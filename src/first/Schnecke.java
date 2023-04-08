package first;
/**
 * Aufgabe 2:
 * <p>
 * Schreiben Sie ein Programm Schnecke, das mit einer ganzen Zahl n zwischen 0
 * und 45 als Aufrufparameter gestartet werden kann und Ihren Namen wiederholt und
 * gewunden wie bei einer Schnecke in einer Matrix der Größe n×n wie in den
 * folgenden Beispielen für n=6 , n=11 und n=14 ausgibt:
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 14.11.2022
 **/

import java.util.Scanner;

public class Schnecke {
    public static void main(String[] args) {

        int n;
        n = Integer.parseInt(args[0]);
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }
        String[] namesString = {"Alex", "Dennis"};
        char[] namesChar;
        String names = namesString[0];
        for (int i = 1; i < namesString.length; i++) {
            names += "_" + namesString[i];
        }
        names += "_";
        namesChar = names.toCharArray();

        int idx = 0;
        int zaehler = 0;
        int r = n;
        int x = n - 1;
        int y = n - 1;
        int richtungX = 0;
        int richtungY = -1;
        int ecken = -1;
        while ((r > 1 && !(r == 2 && ecken == 1))) {
            arr[y][x] = names.charAt(idx);
            zaehler++;
            if (zaehler >= r) {
                zaehler = 1;
                ecken++;

                if (richtungY == -1 && richtungX == 0) {
                    richtungY = 0;
                    richtungX = -1;
                } else if (richtungY == 0 && richtungX == -1) {
                    richtungY = 1;
                    richtungX = 0;
                } else if (richtungY == 1 && richtungX == 0) {
                    richtungY = 0;
                    richtungX = 1;
                } else if (richtungY == 0 && richtungX == 1) {
                    richtungX = 0;
                    richtungY = -1;
                }
            }
            idx++;
            x += richtungX;
            y += richtungY;
            if (idx >= names.length()) idx = 0;
            if (ecken == 2) {
                ecken = 0;
                r -= 2;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
