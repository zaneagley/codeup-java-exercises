package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle();
        Measurable myShape2 = new Square();

        ((Rectangle) myShape).length = 10;
        ((Rectangle) myShape).width = 10;

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


    }

}
