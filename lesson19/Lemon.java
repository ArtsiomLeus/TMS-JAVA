package lesson19;

public final class Lemon extends Fruit {

    private boolean sour;

    public Lemon(double weight,  boolean sour) {
        super(weight, "Lemon");
        this.sour = sour;
    }

    public boolean isSour() {
        return sour;
    }

    public void setSour(boolean sour) {
        this.sour = sour;
    }

    @Override
    public String toString() {
        return "Lemon{" +
                "sour=" + sour +
                '}';
    }
}
