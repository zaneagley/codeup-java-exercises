import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        int lessThanFifthteen = 5;
//        while (lessThanFifthteen < 15) {
//            lessThanFifthteen++;
//            System.out.print(lessThanFifthteen + " ");
//        }

//
//        long squared = 2;
//
//        do {
//            System.out.println(squared + " ");
//            squared *= squared;
//        } while (squared <= 1000000);
//    }}


//        for (int counter = 1; counter <= 100; counter++)
//
//
//            if ((counter % 15) == 0) {
//                System.out.printf("FizzBuzz\t");
//            } else if ((counter % 3) == 0) {
//                System.out.printf("Fizz\t");
//            } else if ((counter % 5) == 0) {
//                System.out.printf("Buzz\t");
//            } else {
//                System.out.printf("%d\t", counter);
//            }
//    }}

//
//        int tableSize = sc.nextInt();
//        printMultiplicationTable(tableSize);
//    }
//
//    public static void printMultiplicationTable(int tableSize) {
//        // first print the top header row
//        System.out.format("      ");
//        for (int i = 1; i <= tableSize; i++) {
//            System.out.format("%4d", i);
//        }
//        System.out.println();
//        System.out.println("------------------------------------------");
//
//        for (int i = 1; i <= tableSize; i++) {
//            // print left most column first
//            System.out.format("%4d |", i);
//            for (int j = 1; j <= tableSize; j++) {
//                System.out.format("%4d", i * j);
//            }
//            System.out.println();
//        }
//        for (int i = 1; i<= tableSize; i++){
//            System.out.println(i * i * i);
//        }
//
//    }


//        System.out.println("Please provide grade 0-100:");
//        int num = sc.nextInt();
//        int gradeNum = num / 10;
//
//        String letterGrade = "";
//
//        switch (gradeNum) {
//            case 10: {
//                System.out.println("Well done, A+!");
//            }
//            case 9: {
//                letterGrade = "A";
//                System.out.println("Well done, A");
//                break;
//            }
//            case 8: {
//                letterGrade = "B";
//                System.out.println("Well done, B");
//                break;
//            }
//            case 7: {
//                letterGrade = "C";
//                System.out.println("Doing ok, C");
//                break;
//            }
//            case 6: {
//                letterGrade = "D";
//                System.out.println("Need some practice, D");
//                break;
//            }
//            default: {
//                System.out.println("Need some practice, F");
//
//            }
//
//
//        }




        // Bonus - Command Line Game



        System.out.println("----Zorn----");
        System.out.println("-You are in the Clearing-");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("         ^");
        System.out.println("         N");
        System.out.println("     < E   W > ");
        System.out.println("         S");
        System.out.println("         v");
        System.out.println("Choose a direction:");

        while (true) {
            String directionChoice = sc.nextLine();
            if (directionChoice.equals("quit")) {
                break;
            }
            else if (directionChoice.equalsIgnoreCase("n") || directionChoice.equalsIgnoreCase("north")
                    || directionChoice.equals("North")){
                System.out.println("You moved north.");
                System.out.println("----Zorn----");
                System.out.println("-You are in the Clearing-");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("         ^");
                System.out.println("         N");
                System.out.println("     < E   W > ");
                System.out.println("         S");
                System.out.println("         v");
                System.out.println("Choose a direction:");
            }
            else if (directionChoice.equalsIgnoreCase("s") || directionChoice.equalsIgnoreCase("south")
                    || directionChoice.equals("South")){
                System.out.println("You moved south.");
                System.out.println("----Zorn----");
                System.out.println("-You are in the Forest-");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("         ^");
                System.out.println("         N");
                System.out.println("     < E   W > ");
                System.out.println("         S");
                System.out.println("         v");
                System.out.println("Choose a direction:");
            }
            else if (directionChoice.equalsIgnoreCase("w") || directionChoice.equalsIgnoreCase("west")
                    || directionChoice.equals("West")){
                System.out.println("You moved west.");
                System.out.println("----Zorn----");
                System.out.println("-You are in the Forest-");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("         ^");
                System.out.println("         N");
                System.out.println("     < E   W > ");
                System.out.println("         S");
                System.out.println("         v");
                System.out.println("Choose a direction:");
            }
            else if (directionChoice.equalsIgnoreCase("e") || directionChoice.equalsIgnoreCase("east")
                    || directionChoice.equals("East")){
                System.out.println("You moved east.");
                System.out.println("----Zorn----");
                System.out.println("-You are in the Clearing-");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("         ^");
                System.out.println("         N");
                System.out.println("     < E   W > ");
                System.out.println("         S");
                System.out.println("         v");
                System.out.println("Choose a direction:");
            }





//            switch (directionChoice) {
//                case "n":
//                case "north":
//                    System.out.println("You moved north");
//                    directionChoice = "";
//                    break;
//                case "s":
//                case "south":
//                    System.out.println("You moved south");
//                    directionChoice = "";
//                    break;
//                case "w":
//                case "west":
//                    System.out.println("You moved west");
//                    directionChoice = "";
//                    break;
//                case "e":
//                case "east":
//                    System.out.println("You moved east");
//                    directionChoice = "";
//                    break;
//                default:
//                    System.out.println("Please type in a direction. (N,S,W,E)");
//                    directionChoice = "";
//                    break;
//
//            }
        }









    }
}