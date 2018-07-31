package shapes;

import util.Input;

public class CircleApp {

   public Input sc = new Input();
   public Circle circleRadius = new Circle();

    public static void main(String[] args) {
        Input sc = new Input();
        CircleApp cirRadius = new CircleApp();



        cirRadius.circleRadius.getRadius(sc.getDouble("Please enter a radius."));
        System.out.println(cirRadius.circleRadius.Circle());
        System.out.println(cirRadius.circleRadius.getArea());
        System.out.println(cirRadius.circleRadius.getCircumference());




    }






}
