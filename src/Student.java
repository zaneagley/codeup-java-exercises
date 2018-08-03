import java.util.ArrayList;

public class Student {

     private String name;
     private String githubUser;
     private ArrayList<Double> grades;

    public Student(String name, String username){
        this.setName(name);
        this.setGithubUser(username);
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  String getGithubUser() {
        return this.githubUser;
    }

    public void setGithubUser(String githubUser) {
        this.githubUser = githubUser;
    }

    public  ArrayList<Double> getGrades() {
        return this.grades;
    }


    public void setGrades(double num, double num2, double num3, double num4) {
        ArrayList<Double> grade = new ArrayList<>();
        grade.add(num);
        grade.add(num2);
        grade.add(num3);
        grade.add(num4);
        this.grades = grade;
    }

    public void setGrades(double num, double num2, double num3) {
        ArrayList<Double> grade = new ArrayList<>();
        grade.add(num);
        grade.add(num2);
        grade.add(num3);
        this.grades = grade;
    }

    public void setGrades(double num, double num2) {
        ArrayList<Double> grade = new ArrayList<>();
        grade.add(num);
        grade.add(num2);
        this.grades = grade;
    }

    public void setGrades(double num) {
        ArrayList<Double> grade = new ArrayList<>();
        grade.add(num);
        this.grades = grade;
    }


    public double getGradeAverage(){
        double sum = 0;
        for(double grade: this.grades)
            sum += grade;
        return sum / this.grades.size();
    }

}
