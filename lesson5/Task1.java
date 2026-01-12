package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] mas = new int[3][5];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < mas.length; i++) {
          for (int j = 0; j < mas[i].length; j++) {
              mas[i][j] = (int) (Math.random() * 10);
              System.out.print(mas[i][j] + " ");
          }
            System.out.println();
        }

        System.out.println();
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int numder = scanner.nextInt();
        System.out.println();

        System.out.println("Массив после изменения: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] += numder;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int sumElements = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                sumElements += mas[i][j];
            }
        }
        System.out.println();
        System.out.println("Сумма всех элементов массива: " + sumElements);
    }
}
