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
        int number = sc.nextInt();
        return number;
    }

    public double getDouble(double min, double max) {
        int number = sc.nextInt();
        while (true) if (number < max && number > min) return number;
        else {
            number = sc.nextInt();
        }
    }

    public double getDouble() {
        int number = sc.nextInt();
        return number;
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
        System.out.println(prompt);
        int number = sc.nextInt();
        return number;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        int number = sc.nextInt();
        while (true) if (number < max && number > min) return number;
        else {
            System.out.println(prompt);
            number = sc.nextInt();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        int number = sc.nextInt();
        return number;
    }







}
