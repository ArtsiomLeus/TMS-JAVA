package lesson18;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2,9,8,8,7,1,6,16,28,28,44));
        System.out.println("Начальная коллекция " + array);

        int sum = array.stream().distinct().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Сумма оставшихся элементов: " + sum);
    }
}
