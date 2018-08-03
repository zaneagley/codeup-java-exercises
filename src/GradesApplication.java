import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        boolean menuMode = true;
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Student> githubUsers = new HashMap<>();

        Student student1 = new Student("Bill", "vallior");
        Student student2 = new Student("Sam", "some_crazy_Boys12");
        Student student3 = new Student("Sally", "keybladeHero72");
        Student student4 = new Student("Steve", "steve");

        student1.setGrades(80, 40, 50, 20);
        student2.setGrades(20, 75, 23, 67);
        student3.setGrades(100, 98, 95, 99);
        student4.setGrades(69, 69, 69, 69.69);



        githubUsers.put(109, student1);
        githubUsers.put(187, student2);
        githubUsers.put(92, student3);
        githubUsers.put(1, student4);

        while(menuMode){
            System.out.println("Welcome!\n" +
                    "\n" +
                    "Here are the github usernames of our students:\n");
            for (Student student: githubUsers.values()){
                System.out.print("|"+student.getGithubUser()+" |");

            }
            System.out.println("\n\nWhat student would you like to review information about?\n");
            System.out.println("You can also exit by typing quit.");
            String user = sc.nextLine();
            for (Student student: githubUsers.values()){
                if (user.equalsIgnoreCase(student.getGithubUser())){
                    System.out.println("Name: "+ student.getName());
                    System.out.println("Grades: "+student.getGrades());
                    System.out.println("Average: "+student.getGradeAverage());
                    sc.nextLine();
                }
                else if (user.equalsIgnoreCase("quit")){
                    menuMode = false;
                    break;
                }
            }
        }
    }







}
