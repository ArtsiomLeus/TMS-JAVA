package lesson7;

public class Rectangle extends Figure{
    private int length;
    private int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public int calculatePerimeter() {
        int s = 2 * (length + width);
        return s;
    }
}
