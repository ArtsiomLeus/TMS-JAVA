package lesson4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] mas = new int[]{5,2,9,6,1,12};
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length / 2; i++) {
            int swap = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = swap;
        }
        System.out.println(Arrays.toString(mas));
    }
}
