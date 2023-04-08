package first;

/**
 * This program prints my first Java experience
 * and my intent to continue
 * @version 3.55, 10 Oct 2022
 * @author Dennis
 */



public class Program1 {
    public static void main(String[] arg) {
        System.out.println("This is my first Java program");
        System.out.println("but it won't be my last");
        for (String s :  arg) {
            System.out.println (s);
        }
    }
}