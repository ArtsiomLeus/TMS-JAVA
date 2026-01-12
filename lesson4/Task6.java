package lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        //int[] mas = new int[6];
        //for (int i = 0; i < mas.length; i++) {
            //mas[i] = (int) (Math.random() * 10);
        //}
        int[] mas = new int[]{1,3,4,5,6,7};
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (i > 0) {
                if (mas[i - 1] >= mas[i]) {
                    System.out.println("Массив не с возврастащей последовательностью");
                    break;
                } if (i == mas.length - 1) {
                    System.out.println("Массив с возврастащей последовательностью");
                }
            }
        }
    }
}
