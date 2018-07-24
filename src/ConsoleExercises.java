import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



//        double pi = 3.14159;
//
//        System.out.printf("%.2f", pi);
//        System.out.println(" ");
//
//
//        System.out.println("Enter a number: ");
//        int input = sc.nextInt();
//        System.out.println(input);
//        System.out.println(" ");
//
//        System.out.println("Enter a three words: ");
//
//        String input1 = sc.next();
//        String input2 = sc.next();
//        String input3 = sc.next();
//
//        System.out.printf("%s, %s, %s", input1, input2, input3);
//        System.out.println(" ");
//        System.out.println("Please enter in a sentence: ");
//        sc.nextLine();
//        String inputSentence = sc.nextLine();
//        System.out.println(inputSentence);


        // Calculate

//        System.out.println("Please enter the length and width of the CodeUp classroom: ");
//
//        String length = sc.nextLine();
//        int lengthNum = Integer.parseInt(length);
//        String width = sc.nextLine();
//        int widthNum = Integer.parseInt(width);
//
//        System.out.println((lengthNum + lengthNum)+(widthNum+widthNum));



        // Bonus

//        System.out.println("Please enter your favorite quote: ");
//        String quote = sc.nextLine();
//        System.out.println(quote);
//        System.out.println("How many words are in your quote?" );
//        int quoteNum = sc.nextInt();
//        System.out.println(quoteNum);

//        System.out.println("List three of your favorite foods, seperated by spaces:");
////        sc.nextLine();
//        String listFavFoods[] = sc.nextLine().split(" ");
//        System.out.printf("1)%s \n2)%s \n3)%s", listFavFoods);
        sc.useDelimiter(",");
        System.out.println("List three of your grocery foods, seperated by commas:");
      //  String groceryList = sc.nextLine();
        String groceryList1 = sc.next();
        String groceryList2 = sc.next();
        String groceryList3 = sc.next();
        System.out.printf("%s %s %s", groceryList1, groceryList2, groceryList3);

    }
}
