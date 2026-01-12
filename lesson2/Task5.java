import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите положительное число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 0) {
                System.out.println("Введены неверные данные, попройте еще");
                return;
            }
        int b = 0;
        for (int i = 0; i <= a; i++) {
            b = b + i;
        }
        System.out.println(b);
    }
}
