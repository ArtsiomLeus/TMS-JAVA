package lesson9;

public class Tiger extends Animal {

    public Tiger (String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " рычит: ррррррррррррр");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println(name + " Ест мясо");
        } else if (food == "Grass") {
            System.out.println(name + " Траву не ест");
        } else {
            System.out.println(name + " Ест только мясо");
        }
    }


}
