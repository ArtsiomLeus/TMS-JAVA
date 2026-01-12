package lesson7;

public class Square extends Figure{
    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public int calculateArea() {
        return sideA * sideA;
    }

    @Override
    public int calculatePerimeter() {
        return 4 * sideA;
    }
}
