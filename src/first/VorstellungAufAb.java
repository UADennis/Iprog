package first;

public class VorstellungAufAb {
    public static void main (String[] args) {
        String a = "Dennis", b = "Nadine", c = "Henri", d = "Lukas", e = "Yagmur";
        System.out.println(aufab(a));
        System.out.println(aufab(b));
        System.out.println(aufab(c));
        System.out.println(aufab(d));
        System.out.println(aufab(e));

    }
    public static String aufab(String x) {
      return x.length() <2 ? x.toUpperCase(): x.substring(0, 1).toUpperCase()+x.substring(1, 2).toLowerCase() + aufab(x.substring(2));

    }
}
