package lesson19;

public class Task1 {
    public static void main(String[] args) {
        var var = """
                2
                Hello
                Привет
                @
                """;
        System.out.println(var);

        System.out.println("-----------------------------------------");
        Person person = new Person("Артем", 25, 11234566);
        System.out.println(person);

        System.out.println("-----------------------------------------");
        Grape grape = new Grape("yellow", 1);
        Lemon lemon = new Lemon(0.3, true);
        Pear pear = new Pear(0.5, "conference");

        System.out.println(grape);
        System.out.println(lemon);
        System.out.println(pear);

    }
}
