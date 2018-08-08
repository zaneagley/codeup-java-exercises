import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Paths;

public class JavaTest
{
    public static void main(String[] args){
//
//        try {
//            FileWriter fw = new FileWriter("randomText.txt");
//            PrintWriter pw = new PrintWriter(fw);
//
//            pw.println("This is some random test.");
//            pw.println("\n\nMoar text.");
//
//            pw.close();
//
//        } catch (IOException e) {
//            out.println("Error");
//        }


       // Path serverPath = Paths.get("server_names", "server.txt");
        try {
            List<String> serverNameList = Files.readAllLines(Paths.get("server_names", "servers.txt"));
            for (int i = 0; i < serverNameList.size(); i += 1) {
                System.out.println((i + 1) + ": " + serverNameList.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }


}





