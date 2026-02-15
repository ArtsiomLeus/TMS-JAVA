package lesson17;

import java.util.function.Consumer;

public class Task4 {
    public static void main (String[] args) {
        final double course = 0.35;

        Consumer<String> exchange = input -> {
            try {
                if (input == null || input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Строка не должна быть пустой");
                }
                String[] byn = input.trim().split("\\s+");
                if (byn.length != 2) {
                    throw new IllegalArgumentException("Строка должна быть в формате “*сумма* BYN”");
                }
                double amountBYN = Double.parseDouble(byn[0]);
                double amountUSD = amountBYN * course;
                System.out.println("Переданная сумма в BYN = " + amountUSD + " USD");
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Некорректное значение", e);
            }
        };
        exchange.accept("100 BYN");
    }
}
