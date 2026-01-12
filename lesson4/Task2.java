package lesson4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int max;
        int[] mas = new int[]{5,2,9,6,1,12};
        Arrays.sort(mas);
        max = mas[mas.length - 1];
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + mas[0]);
    }
}
