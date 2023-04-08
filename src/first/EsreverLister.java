package first;
/**
 *Aufgabe 5:
 *
 * Schreiben Sie ein Java-Programm EsreverLister, das beliebig viele TextZeilen von der Tastatur einliest, solange, bis das Wort „potS“ eingegeben
 * wird, oder das Ende der Eingabe (^Z) erreicht ist (Abfrage auch auf null).
 * Anschließend sollen alle gelesenen Zeilen invertiert und in umgekehrter
 * Reihenfolge auf den Bildschirm ausgegeben werden.
 * Testen Sie das Programm, indem Sie es auf sich selbst anwenden.
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 07.11.2022
 **/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EsreverLister {
    public static String invert(String s) {
        String result = "";
        for(int i = s.length() - 1; i>=0; i--)
            result += s.charAt(i);
        return result;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Gib ein Text ein: ");
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = keyboard.readLine();
            if(s == null || s.equals("potS"))
                break;
            list.add(s);
        }
        System.out.println("-----------------------------------");
        for(int i = list.size() - 1; i >= 0; i--)
            System.out.println(invert(list.get(i)));
        keyboard.close();
    }

}
