package lesson8;

public class Surgeon extends Doctor {

    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("Хирург " + getName() + " оперирует");
    }
}
