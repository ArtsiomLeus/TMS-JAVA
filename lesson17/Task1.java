package lesson17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения (в формате: гггг-мм-дд):");
        String input = scanner.nextLine();

        try {
            LocalDate birthDay = LocalDate.parse(input);
            LocalDate hundredYears = birthDay.plusYears(100);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String formatterDate = hundredYears.format(formatter);
            System.out.println(formatterDate);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты (поддерживает формат: yyyy-MM-dd)");
        } finally {
            scanner.close();
        }
    }
}
