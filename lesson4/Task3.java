package lesson4;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[6];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int indexOfMin = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < mas[indexOfMin]) {
                indexOfMin = i;
            }
        }
        String moreIndexMin = " ";
        for (int i = 0; i < mas.length; i++) {
            if (mas[indexOfMin] == mas[i]) {
                moreIndexMin += " " + i;
            }
        }
        System.out.println("Индекс минимального числа:" + moreIndexMin);

        int indexOfMax = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > mas[indexOfMax]) {
                indexOfMax = i;
            }
        }
        String moreIndexMax = " ";
        for (int i = 0; i < mas.length; i++) {
            if (mas[indexOfMax] == mas[i]) {
                moreIndexMax += " " + i;
            }
        }
        System.out.println("Индекс максимального числа:" + moreIndexMax);
    }
}
