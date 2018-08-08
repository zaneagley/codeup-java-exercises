import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class ServerNameGenerator {
    static Random rand = new Random();
    static String [] adjArr = {"Dedicated", "elegant", "flabby", "stocky", "eager", "dazzling", "helpless", "zealous", "faithful"};
    static String [] nounArr = {"proton", "beaver", "badger", "mongoose", "steve", "peanut", "bee", "Bond", "duck", "ant"};


    public static void main(String[] args) {


        String firstPart = adjArr[rand.nextInt(adjArr.length)];
        String secondPart = nounArr[rand.nextInt(nounArr.length)];
        System.out.println("Here is your server name:");
        System.out.println(firstPart +"-"+ secondPart);



        String directory = "server_names/save";
        String filename = "servers.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);


        if (Files.notExists(dataDirectory)) {

            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (! Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        List<String> serverNameList = Arrays.asList(firstPart +"-"+ secondPart);

        try {
            Files.write(Paths.get(directory, filename), serverNameList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("No Save");
            e.printStackTrace();
        }


    }
}
