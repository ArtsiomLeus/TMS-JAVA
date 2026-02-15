package lesson17;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main (String[] args) {

        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String userInput = scanner.nextLine();
            String reverse = new StringBuilder(userInput).reverse().toString();
            return reverse;
        };
        System.out.print("Строка задом наперед: " + supplier.get());
    }
}
