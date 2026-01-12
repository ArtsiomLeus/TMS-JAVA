package lesson9;

public class Check {
    public static void main (String[] args) {
        Animal dog = new Dog("Собака");
        Animal tiger = new Tiger("Тигр");
        Animal rabbit = new Rabbit("Кролик");

        System.out.println("Голоса животных: ");
        dog.voice();
        tiger.voice();
        rabbit.voice();
        System.out.println();

        System.out.println("Кормим мясом: ");
        dog.eat("Meat");
        tiger.eat("Meat");
        rabbit.eat("Meat");
        System.out.println();

        System.out.println("Кормим травой: ");
        dog.eat("Grass");
        tiger.eat("Grass");
        rabbit.eat("Grass");
        System.out.println();

        System.out.println("Кормим другой едой: ");
        dog.eat("Apple");
        tiger.eat("Apple");
        rabbit.eat("Apple");
    }
}
