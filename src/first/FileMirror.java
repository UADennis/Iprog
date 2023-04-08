package first;
import java.io.*;
/**
 * @author Dennis Mayer
 * @version 1, 17.10.2022
 **/
public class FileMirror {

    public static void main(String[] args) throws IOException {
        File f1 = new File("src/first/FileMirror.java");
        File f2 = new File("src/first/test2.txt");
        FileReader fileReader1 = new FileReader(f1);
        BufferedReader reader2 = new BufferedReader(fileReader1);
        PrintStream writer = new PrintStream(new FileOutputStream(f2));
        String line;
        line = reader2.readLine();
        while (line !=null){
            writer.println(invert(line));
            line=reader2.readLine();
        }

    }
    public static String invert(String x) {
        return x.length() <= 1 ? x :
                invert(x.substring(1)) + x.substring(0, 1);
    }
}
