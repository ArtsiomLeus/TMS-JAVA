package lesson7;

public class Figure1 {
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        figure[0] = new Triangle(3, 3, 4);
        figure[1] = new Rectangle(5,8);
        figure[2] = new Circle(6);
        figure[3] = new Square(10);
        figure[4] = new Rectangle(8, 12);

        int totalPerimeter = 0;

        for (int i = 0; i < figure.length; i++) {
            System.out.println("Фигура: " + i + " : ");
            figure[i].info();
            totalPerimeter += figure[i].calculatePerimeter();
        }
        System.out.println("Сумма периметра всех фируг: " + totalPerimeter);
    }
}
