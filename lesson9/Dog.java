package lesson9;

public class Dog extends Animal{

    public Dog (String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + " гавкает: гав гав");
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
