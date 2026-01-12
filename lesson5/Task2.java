package lesson5;

public class Task2 {
    public static void main(String[] args) {
        String [][] mas = new String[8][8];
        String b = "B";
        String w = "W";
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j % 2 == 0) {
                    mas[i][j] = w;
                } else {
                    mas[i][j] = b;
                }

                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

    }
}
