import java.util.Scanner;

public class MethodsExercises {
    static int number = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(isOne("1"));
       // System.out.println(getInteger(1, 10));
        // diceRoll(1, 6);

        System.out.println(Factorial(5));



    }


//    // Cares about the return result
//    public static boolean isOne(int number) {
//        return number == 1;
//    }
//
//    // Method overloading
//    public static boolean isOne(String number) {
//        return number.equalsIgnoreCase("1");
//    }
//
//    // Does not care about the result
//    public static void eatCereal() {
//
//    }


    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int Division(int num1, int num2) {
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2) {
        return num1 % num2;
    }






    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (number > max || number < min) {
            System.out.println("Please input a number between the "+min+" and "+max+" range.");
            number = sc.nextInt();
        }
        return number;
    }


    public  static int factoralInt(int min, int max) {
        System.out.println("Please input a number between "+min+" and "+max+" range for factoraling.");
        Scanner sc = new Scanner(System.in);
        long factorial = 1;
        getInteger(min, max);
        for (int i = 1; i < number; i++) {
            System.out.println(factorial *= i);
        }
        return number;
    }

    public static void diceRoll(int min, int max){
        Scanner sc = new Scanner(System.in);

        int range = (max - min) + 1;

        boolean userContinues = true;

        do {
            int number =(int)(Math.random() * range) + min;
            System.out.println(number);
            System.out.print("Would you like to enter another number (y/n)? ");
            String userResponse = sc.next();

        if (!userResponse.equalsIgnoreCase("y")) {
            userContinues = false;
        }
        }while (userContinues);

    }
    public static int Factorial(int num) {
        if (num <= 1)
            return 1;
        return num * Factorial(num - 1);
    }



}
