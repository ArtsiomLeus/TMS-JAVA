package lesson9;

public class Rabbit extends Animal{

    public Rabbit (String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " пищит: пи пи пи");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println(name + " Мясо не ест");
        } else if (food == "Grass") {
            System.out.println(name + " Ест траву");
        } else {
            System.out.println(name + " Ест только траву");
        }
    }
}
