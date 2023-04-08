package first;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Aufgabe 2:
 *
 * Erweitern Sie die Klasse Person so, dass die hoehe, (=Körpergröße in Meter)
 * (float), und der Geburtsort nun ebenfalls mit modelliert werden. Die Methode
 * toString soll nun (neben den übrigen Daten) auch
 * – das Alter der Person in Jahren liefern und
 * – einen Hinweis, ob die Person klein, mittel oder groß ist;
 * dabei soll der Bereich für „mittel“ zwischen 1.49 m und 1.82 m liegt
 * Jede Person soll sich selbst bei der Nachricht compareWith(..) mit einer anderen
 * Person, die als Parameter der Methode übergeben wird, vergleichen. Dabei wird
 * (auf den Bildschirm) ausgegeben, wer von beiden um wieviel älter/jünger bzw.
 * größer/kleiner ist.
 * Die main- Methode soll Tests für die Klasse enthalten.
 * Hinweis: Das aktuelle Jahr bekommt man durch den Ausdruck
 * new GregorianCalendar().get(Calendar.YEAR)
 * und die dabei verwendeten Klassen befinden sich im Packet java.util
 *
 * @author Dennis Mayer
 * @version 2, 31.10.2022
 **/


public class Person {
    private String vorname;
    private String nachname;
    private String beruf;
    private int geburtsjahr;
    private float hoehe;
    private int alter;


    public Person(String Vorname, String Nachname, String Beruf, int geburtsjahr, float hoehe) {
        this.vorname = Vorname;
        this.nachname = Nachname;
        this.beruf = Beruf;
        this.geburtsjahr = geburtsjahr;
        this.hoehe = hoehe;
        alter = new GregorianCalendar().get(Calendar.YEAR) - this.geburtsjahr;
    }
    public Person(){
        vorname = MyIO.promptAndRead("Geben sie Bitte ihren Namen ein: ");
        nachname = MyIO.promptAndRead("Geben sie nun bitte ihren Nachname ein: ");
        beruf = MyIO.promptAndRead("Was ist ihr Beruf ?: ");
        geburtsjahr = MyIO.readInt("Wann sind sie geboren ");
        hoehe = MyIO.readFloat("Geben sie ihre Körpergröße an: ");
        alter = new GregorianCalendar().get(Calendar.YEAR) - this.geburtsjahr;

    }
    public String giveHeight() {

        String bemerkung;

        if (hoehe >= 1.82) {
            bemerkung = "Die Person ist groß";
        } else if (hoehe >= 1.49) {
            bemerkung = "Die Person ist mittelgroß";
        } else {
            bemerkung = "Die Person ist klein";
        }
        return bemerkung;
    }

    public void compareWith(Person person){
        float hohenunterschied;
        int altersunterschied;
        int yearNow = new GregorianCalendar().get(Calendar.YEAR);
        hohenunterschied = this.hoehe - person.hoehe;
        altersunterschied = this.alter - person.alter;

        if(hohenunterschied > 0) {
            System.out.println("Die Person " + this.vorname + " ist " + hohenunterschied +"m Größer als " + person.vorname);
        }
        else{
            System.out.println(person.vorname + " ist " + -hohenunterschied + "m größer als " + this.vorname);
        }

        if(altersunterschied > 0){
            System.out.println("Die Person " + this.vorname + " ist " + altersunterschied +" Jahre älter als " + person.vorname);
        }
        else{
            System.out.println("Die Person " + this.vorname + " ist " + -altersunterschied +" Jahre jünger als " + person.vorname);
        }

    }
    public String toString() {
        return "Der Vorname der Person ist: \"" +  vorname + "\"\nNachname der Person ist: \"" + nachname + "\"\nBeruf der Person ist: \"" + beruf + "\"\nGeburtsjahr der Person ist: \"" + geburtsjahr + "\"\nDie Höhe der Person ist: \"" + hoehe + "\"\nDas Aktuelle Alter der Person ist: \"" + alter + "\n" + giveHeight();
    }
    public static void main (String[] args){
        Person person2 = new Person();
        System.out.println(person2.toString());
        Person alexander = new Person ("Alexander", "Cherniaev", "Student", 1999, 1.75f);
        Person dennis = new Person ("Dennis", "Mayer", "Student", 2000, 1.78f);
        System.out.println(dennis.toString());
        dennis.compareWith(alexander);

    }

}