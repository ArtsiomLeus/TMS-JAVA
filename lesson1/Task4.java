package lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
              double m = (int) n;
        if (0.4 > (n-m)) {
            System.out.println(m);
        } else {
            double i = m + 1;
            System.out.println(i);
        }
    }
}
