package two_Dimensional_Aarrays;
//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
import java.util.Random;

public class Task2_11 {
    private static final int ROWS = 10;
    private static final int COLUMNS = 20;

    public void task2_11() {
        Random rnd = new Random();
        int count = 0;
        int[][] array = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                array[i][j] = rnd.nextInt(16) + 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < ROWS; i++) {
            count = 0;
            for (int j = 0; j < COLUMNS; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(i + "-ая строка" + " содержит:" + count + " пятерки(ок).");
            }
        }
    }
}
