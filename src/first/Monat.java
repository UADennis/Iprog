package first;
/**
 *Aufgabe 1:
 *
 * Schreiben Sie ein Java-Programm Monat, das einen Aufzählungstyp (enum) mit
 * dem gleichen Namen kennt für (Januar, Februar, …, Dezember). Jeder Monat hat
 * eine Nummer, (1, …, 12) deren Wert mit getNumber() abgefragt werden kann.
 * Das Programm soll nacheinander zwei Listen ausgeben und dazu jeweils über alle
 * Monate iterieren. Die erste Liste besteht aus den Monaten, in denen der Buchstabe
 * „m“ vorkommt und deren Nummer ungerade ist, die zweite Liste enthält die Monate,
 * in denen ein „b“ vorkommt und deren Nummer gerade ist.
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 14.11.2022
 **/
import java.util.ArrayList;

public enum Monat {
    Januar (1),
    Februar (2),
    Maerz (3),
    April(4),
    Mai(5),
    Juni(6),
    Juli(7),
    August(8),
    September(9),
    Oktober(10),
    November(11),
    Dezember(12);



    private final int number;

    Monat(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public Boolean contains (String str) {
        return toString().toLowerCase().contains(str.toLowerCase());
    }
    public Boolean istGerade() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        ArrayList <Monat> list1 = new ArrayList<>();
        ArrayList<Monat> list2 = new ArrayList<>();
        for (Monat monat : Monat.values()) {
            if (monat.contains("m")) {
                if(!monat.istGerade())
                    list1.add(monat);

            }
            if (monat.contains("b")) {
                if (monat.istGerade())
                    list2.add(monat);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
