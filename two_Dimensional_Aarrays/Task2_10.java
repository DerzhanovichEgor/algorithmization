package two_Dimensional_Aarrays;
//10. Найти положительные элементы главной диагонали квадратной матрицы.
import java.util.Arrays;
import java.util.Random;

public class Task2_10  {
    public void task2_10(int n) {
        Random rnd = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rnd.nextInt(20) - 10;

            }

        }
        System.out.println(Arrays.deepToString(array));
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && array[i][j] >= 0) {
                    System.out.print(array[i][j] + " ");
                }
            }

        }
    }}
