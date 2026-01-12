package lesson4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] mas = new int[]{5,2,9,6,1,12};
        Arrays.sort(mas);
        System.out.println("Прямой порядок:");
        for (int num : mas) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Обратный порядок:");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
       }
}
