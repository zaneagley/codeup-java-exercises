import java.io.*;
import static java.lang.System.*;

public class JavaTest
{
    public static void main(String[] args)
    {
        try {
            FileWriter fw = new FileWriter("randomText.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("This is some random text.");
            pw.println("\n\nMoar text.");

            pw.close();

        } catch (IOException e) {
            out.println("Error");
        }


    }
}