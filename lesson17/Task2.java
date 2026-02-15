package lesson17;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {

        Integer[] array = {3, -22, 5, -1, 10, -5, -11, 7, - 44, 99, 500};
        ArrayList<Integer> resalt = new ArrayList<>();

        Predicate<Integer> positiveNumbers = x -> x > 0;

        for (Integer i : array) {
            if(positiveNumbers.test(i) == true) {
                resalt.add(i);
            }
        }
        System.out.println(resalt);
    }
}
