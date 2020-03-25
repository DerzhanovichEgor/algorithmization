package two_Dimensional_Aarrays;
//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
import java.util.Arrays;
import java.util.Random;

public class Task2_12 {
    public void task2_12(int n){
        Random rnd = new Random();
        int temp;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rnd.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){

                    for (int k = 0; k < n - 1; k++) {
                        if (array[i][k] > array[i][k + 1])
                        { temp = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1] = temp;
                    }}
                }
                else {
                    for (int k = 0; k < n - 1; k++) {
                        if (array[i][k] < array[i][k + 1])
                        { temp = array[i][k];
                            array[i][k] = array[i][k+1];
                            array[i][k+1] = temp;
                    }
                }
            }
        }}
        System.out.println(Arrays.deepToString(array));
    }
}
