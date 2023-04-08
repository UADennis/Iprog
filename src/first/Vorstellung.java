package first;

/**
 * @author Dennis Mayer, Yagmur Simsek, Nadine Schoch, Lukas Vier, Henri Staudenrausch
 * @version 1, 10.10.2022
 **/

public class Vorstellung {
    public static String invert(String x) {
        return x.length() <= 1 ? x :
                invert(x.substring(1)) + x.substring(0, 1);
    }


    public static void main(String[] args) {
        String a = "Dennis", b = "Nadine", c = "Henri", d = "Lukas", e = "Yagmur";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(invert(a));
        System.out.println(invert(b));
        System.out.println(invert(c));
        System.out.println(invert(d));
        System.out.println(invert(e));
    }
}
