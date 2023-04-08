package first;

public class Zip {
    public static void main(String[] args) {
        String a = "Dennis", b = "Nadine", c = "Henri", d = "Lukas", e = "Yagmur";
        System.out.println(zip(b, c));

    }

    public static String zip(String f, String g) {
        return f.length() <= 1 || g.length() <= 1 ? f + g : f.substring(0, 1) + g.substring(0, 1) + zip(f.substring(1), g.substring(1));
    }
}

