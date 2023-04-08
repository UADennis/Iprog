package first;
/**
 *Aufgabe 2:
 *
 * (Der Wert von n soll automatisch gewählt werden und hinreichend groß sein.)
 * Schreiben Sie ein Programm LongOrder, das 3 Zahlen (long) einliest und in
 * aufsteigender Reihenfolge wieder ausgibt, die kleinste Zahl zuerst, die größte
 * zuletzt. – Können Sie das Programm auch so verändern, dass vier Zahlen korrekt
 * sortiert werden?
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 07.11.2022
 **/

public class LongOrder {

    public static void main(String[] args) {
        long[] list;
        int amount_of_numbers = 3;
        list = new long[amount_of_numbers];
        System.out.println("Geben sie bitte Zahlen ein: ");
        for(int i = 0; i < amount_of_numbers; i++){
            list[i] = MyIO.readLong(i + 1 + ". Nummer: ");
        }

        for(int i = amount_of_numbers - 1; i >=0; i--)
            for(int j = 0; j < i; j++)
                if(list[j] > list[j + 1]){
                    long temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

        for(long number : list)
            System.out.print(number + ", ");
    }
}
