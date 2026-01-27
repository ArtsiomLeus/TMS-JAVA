package lesson15;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<>();
        array.add("Германия");
        array.add("Италия");
        array.add("Англия");
        System.out.println(array);

        array.set(1, "Франция");
        System.out.println(array);

        array.remove(1);
        System.out.println(array);

        array.remove("Германия");
        System.out.println(array);

        int index = array.indexOf("Англия");
        System.out.println("Индекс Англии в листе равен: " + index);

        System.out.println(array.contains("Польша"));



    }
}
