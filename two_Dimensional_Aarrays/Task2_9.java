package two_Dimensional_Aarrays;
/*9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
*/
import java.util.Random;

public class Task2_9 {
    public void task2_9(int n){
        Random rnd = new Random();
        int[][] array = new int[n][n];
        int max = array[0][0];
        int sum = 0;
        int column = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += array[j][i];
            }
            if(sum>max){
                max = sum;
                column = i + 1;
            }

        }
        System.out.println("Столбец №" + column + " содержит максимальную сумму: " + max);


    }
}
