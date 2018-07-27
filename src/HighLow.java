import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the grand awesome guessing game!\n\nPlease input a number between 1 and 100!");

        int numberToGuess = randomNumber();
        compareNumbers(numberToGuess);

    }

    public static int randomNumber() {

        int range = (100 - 1) + 1;
        int number =(int)(Math.random() * range) + 1;
        return number;

    }

    public static int promptUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number you think it is!");
        int guessNumber = sc.nextInt();
        return guessNumber;
    }

    public static void compareNumbers(int numToGuess) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println(numToGuess);
        int numGuessed = promptUser();

        while (true) {
            if (numToGuess == numGuessed) {
                System.out.println("Good Guess! You took: "+ i +" amount of tries.\n\nWould you like to play again? (y/n)");
                String choice = sc.next();
                if (!choice.equalsIgnoreCase("y")) {
                    System.out.println("Good Bye!");
                    break;
                } else {
                    numToGuess = randomNumber();
                    numGuessed =  promptUser();
                    i = 0;
                }

            }
            if (numToGuess > numGuessed && i < 10) {
                System.out.println("Higher!");
                i++;
                numGuessed = promptUser();
            } else if (numToGuess < numGuessed && i < 10) {
                System.out.println("Lower!");
                i++;
                numGuessed = promptUser();

            }
            else if (i == 10) {
                System.out.println("Out of Guesses!  Try again? (y/n)");
                String choice = sc.next();
                if (!choice.equalsIgnoreCase("y")) {
                    System.out.println("Good Bye!");
                    break;
                } else {
                    numToGuess = randomNumber();
                    numGuessed =  promptUser();
                    i = 0;
                }
            }

            else {
                System.out.println("Try a different number.");
                i++;
                numGuessed = promptUser();
            }
        }
    }


}
