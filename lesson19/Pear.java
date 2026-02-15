package lesson19;

public final class Pear extends Fruit {

    private String sort;

    public Pear(double weight, String sort) {
        super(weight, "Pear");
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "sort='" + sort + '\'' +
                '}';
    }
}
