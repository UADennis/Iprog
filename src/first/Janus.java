package first;
import java.io.*;
/**
 * @author Dennis Mayer
 * @version 1, 17.10.2022
 **/

public class Janus {
    public static void main(String[] arg) throws IOException{
        System.out.println("Das ist mein Programm");
            File file = new File("src/first/Janus.java");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
    }
}
