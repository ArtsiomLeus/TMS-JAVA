package lesson4;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[6];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int zeroElements = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                zeroElements++;
            }
        }
        if (zeroElements > 0) {
            System.out.println("Количесво нулевых элементов: " + zeroElements);
        } else {
            System.out.println("Нулевых элементов нет");
        }

    }
}
