package lesson19;

public final class Grape extends Fruit {

    private String color;

    public Grape (String color, double weight) {
        super(weight, "Grape");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Grape{" +
                "color='" + color + '\'' +
                '}';
    }
}
