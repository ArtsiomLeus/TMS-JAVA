package lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");

        String input = scanner.nextLine();

        System.out.println("Найденые абревиатуры:");

        Pattern pattern = Pattern.compile("[A-Za-zА-Яа-я]{2,6}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
