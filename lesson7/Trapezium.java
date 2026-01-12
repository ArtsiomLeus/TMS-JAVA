package lesson7;

public class Trapezium extends Figure{
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;


    public Trapezium(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }


    @Override
    public int calculateArea() {
        return 0;
    }

    @Override
    public int calculatePerimeter() {
        int s = 2 * (sideA + sideB + sideC + sideD);
        return s;
    }
}
