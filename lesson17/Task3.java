package lesson17;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        final double course = 0.35;

        Function<String,Double> exchange = (input) -> {
            try {
                if (input == null || input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Строка не должна быть пустой");
                }

                String[] amountStr = input.trim().split("\\s+");
                if (amountStr.length != 2) {
                    throw new IllegalArgumentException("Строка должна быть в формате “*сумма* BYN”");
                }
                double amountBYN = Double.parseDouble(amountStr[0]);
                return amountBYN * course;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Некорректное значение", e);
            }
        };

        System.out.println("253 BYN = " + exchange.apply("253 BYN") + " USD");
    }
}
