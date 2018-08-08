package util;

import java.util.Scanner;

public class Input {
   private Scanner sc = new Scanner(System.in);


    public String getString(){
        String string = sc.nextLine();
        return string;
    }

    public boolean yesNo(){
      String yaNah = sc.next();
        if (yaNah.equalsIgnoreCase("y") || yaNah.equalsIgnoreCase("yes"))
            return true;
        else return false;

    }

    public int getInt(int min, int max) {
        int number = sc.nextInt();
        while (true) {
            if (number < max && number > min) return number;
            else {
                number = sc.nextInt();
            }
        }
    }

    public int getInt() {
        int trueNum;
        while(true) {
            try {
                String number = sc.next();
                trueNum = Integer.valueOf(number);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Please input a integer.");
            }

        }
        return trueNum;
    }

    public double getDouble(double min, double max) {
        int number = sc.nextInt();
        while (true) if (number < max && number > min) return number;
        else {
            number = sc.nextInt();
        }
    }

    public double getDouble() {
        double truenum;
        while (true)
            try {
                String number = sc.next();
                truenum = Double.valueOf(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please input a number.");
            }
        return truenum;
    }




    public String getString(String prompt){
        System.out.println(prompt);
        String stringOutPut = sc.nextLine();
        return stringOutPut;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String yaNah = sc.next();
        if (yaNah.equalsIgnoreCase("y") || yaNah.equalsIgnoreCase("yes"))
            return true;
        else return false;

    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int number = sc.nextInt();
        while (true) {
            if (number < max && number > min) return number;
            else {
                System.out.println(prompt);
                number = sc.nextInt();
            }
        }
    }

    public int getInt(String prompt) {
        try {
            System.out.println(prompt);
            int number = sc.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Please input a integer.");
            int number = sc.nextInt();
            return number;
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double number = sc.nextInt();
        while (true) if (number < max && number > min) return number;
        else {
            System.out.println(prompt);
            number = sc.nextInt();
        }
    }

    public double getDouble(String prompt) {
        try {
            System.out.println(prompt);
            double number = sc.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Please input a double number.");
            double number = sc.nextInt();
            return number;
        }
    }







}
