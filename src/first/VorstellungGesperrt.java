package first;

public class VorstellungGesperrt {
    public static void main (String[] args) {
        String a = "Dennis", b = "Nadine", c = "Henri", d = "Lukas", e = "Yagmur";
        System.out.println(gesperrt(a));
        System.out.println(gesperrt(b));
        System.out.println(gesperrt(c));
        System.out.println(gesperrt(d));
        System.out.println(gesperrt(e));

    }
    public static String gesperrt(String x) {
        return x.length() <1 ? x : x.substring(0,1) + " " + gesperrt(x.substring(1));

    }
}
