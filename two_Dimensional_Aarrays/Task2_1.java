package two_Dimensional_Aarrays;

import java.util.Arrays;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task2_1 {
    public void task2_1() {
    int[][] array = generateArray.generateMAtrix(5);
    int n = array[0].length;
       // System.out.println(Arrays.deepToString(array));
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[0][j] > array[n-1][j]) {
                    if (i % 2 != 0 && j % 2 != 0) {
                        System.out.print(array[i][j] + " ");

                    }
                    if (i % 2 != 1 && j % 2 != 0) {
                        System.out.print(array[i][j] + " ");
                    }

                }
            }
            System.out.println();
        }
    }
}


