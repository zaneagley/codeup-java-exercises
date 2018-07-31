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



    }
}
