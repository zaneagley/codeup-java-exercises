import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        int lessThanFifthteen = 5;
//        while (lessThanFifthteen < 15) {
//            lessThanFifthteen++;
//            System.out.print(lessThanFifthteen + " ");
//        }


        long squared = 2;

        do {
            System.out.println(squared + " ");
            squared *= squared;
        } while (squared <= 1000000);
    }}


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



