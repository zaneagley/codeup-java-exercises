package shapes;

public class Circle {

    private final double pi = 3.14;
    private double radius;


    public double getRadius(double number){
       return radius = number;
    }

    public double Circle(){
        return radius + radius;
    }
    public double getArea(){
        return pi * (radius * radius);
    }
    public double getCircumference(){
        return 2 * pi * radius;
    }
}
