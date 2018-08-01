package shapes;

public class Rectangle {

    protected int length;
    protected int width;


//    perimeter = 2 x length + 2 x width
//    area = length x width
    public int getArea(){
        return length * width;
    }
    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

}
