package lesson7;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int calculateArea() {
        int s = calculatePerimeter() / 2;
        return (s - sideA) * (s - sideB) * (s - sideC);
    }

    @Override
    public int calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
