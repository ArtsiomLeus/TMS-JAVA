package lesson8;

public class Dentist extends Doctor{

    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("Стоматолог " + getName() + " лечит зубы");

    }
}
