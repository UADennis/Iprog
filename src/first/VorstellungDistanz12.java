package first;


public class VorstellungDistanz12{
    public static void main (String[] args){
        String a = "Dennis", b = "Nadine", c = "Henri", d = "Lukas", e = "Yagmur";
        System.out.println(distanz(a));
        System.out.println(distanz(b));
        System.out.println(distanz(c));
        System.out.println(distanz(d));
        System.out.println(distanz(e));
    }
    public static String distanz(String x) {
        return x.length() <=1 ? x : x.substring(0,1) + " " + x.substring(1,2) + "  " + distanz(x.substring(2));
    }

}
