package shapes;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        Rectangle box2 = new Square();


        box1.width = 4;
        box1.length = 5;
        ((Square) box2).constructorSide(5);

        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());


    }

}
