package two_Dimensional_Aarrays;
//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task2_15 {
    public void task2_15(int n ) {
       /* Random rnd = new Random();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rnd.nextInt(20);
            }
        }*/
     int[][] array =  generateArray.generateMAtrix(n);
        int max = array[0][0];
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(array[i][j]> max)
                    max = array[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(array[i][j]%2!=0){
                    array[i][j] = max;
                }
            }
        }
        System.out.println();

        System.out.println(Arrays.deepToString(array));
    }
}
