package lesson7;

public abstract class Figure {
    public abstract int calculateArea();
    public abstract int calculatePerimeter();

    public void info() {
        System.out.println("Площадь = " + calculateArea() + " , " + " Периметр = " + calculatePerimeter());
    }
}