package two_Dimensional_Aarrays;
//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2_14 {
    public void task2_14(int n){
        int count = 0;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            count = i;
            for (int j = 0; j < n; j++) {
                if(count > 0){
                    array[i][j] = 1;
                    count--;
                }
                else{
                    array[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
}
