package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 2;
        if (b <= 0) {
            System.out.println("четное число");
        } else {
            System.out.println("нечетное число");
        }
    }
}
