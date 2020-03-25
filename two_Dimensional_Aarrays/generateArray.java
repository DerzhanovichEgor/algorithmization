package two_Dimensional_Aarrays;

import java.util.Random;
//метод возвращает массив массивов(матрицу) размерность n * n заполненную ччислами от 0 до 19
public class generateArray {
    public static int[][] generateMAtrix(int n){
        Random rnd = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rnd.nextInt(20);
            }
        }
        return array;
    }
}
