package shapes;

public class Square extends Rectangle {

    protected int side = length + width;


    public int constructorSide(int num){
        return side = num;
    }

    @Override
    public int getArea(){
        return 4 * side;
    }
    @Override
    public int getPerimeter(){
        return side * side;
    }


}
