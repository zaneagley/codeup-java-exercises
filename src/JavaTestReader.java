import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.*;

public class JavaTestReader {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("randomText.txt");
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {
                out.println(str + "\n");
            }

            br.close();
        } catch (IOException e) {
            out.println("File not Found.");
        }
    }
}
