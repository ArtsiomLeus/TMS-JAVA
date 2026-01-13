package lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");

        String input = scanner.nextLine();

        while (input.isEmpty() || input.equals(" ")) {
            System.out.println("Введена пустая строка");
            System.out.println();
            System.out.println("Введите строку:");
            input = scanner.nextLine();
        }

        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]{2,6}\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Найденые абревиатуры:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if(!found) {
            System.out.println("Абревиатуры не найдены");
        }

        scanner.close();
    }
}

