package lesson13;

public class Test {
    public static void main (String[] args) {
        boolean result1 = Task1.validate("user123", "password123", "password123");
        System.out.println("Тест 1: " + result1);

        boolean result2 = Task1.validate("user 123", "password123", "password123");
        System.out.println("Тест 2 (логин с пробелом): " + result2);

        boolean result3 = Task1.validate("ДлинныйЛогинКоторыйБолее20Символов",
                "password123", "password123");
        System.out.println("Тест 3 (длинный логин): " + result3);

        boolean result4 = Task1.validate("user123", "password", "password");
        System.out.println("Тест 4 (пароль без цифр): " + result4);

        boolean result5 = Task1.validate("user123", "password123", "password456");
        System.out.println("Тест 5 (пароли не совпадают): " + result5);

        boolean result6 = Task1.validate("user123", "pass word123", "pass word123");
        System.out.println("Тест 6 (пробелы в пароле): " + result6);
    }
}
