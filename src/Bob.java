import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Have nice chat with Bob, the lackluster teenager!");


        while (true) {
            System.out.println("Type in your response:");
            String sentence = sc.nextLine();

            if (sentence.equalsIgnoreCase("quit")) {
                System.out.println("Smell ya later.");
                break;
            }
            else if ((sentence.trim().endsWith("?"))) {
                System.out.println("Sure.");

            }
            else if ((sentence.trim().endsWith("!"))) {
                System.out.println("Woah, chill out!");

            }
            else {
                System.out.println("Whatever.");
            }

        }



    }
}
