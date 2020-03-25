package two_Dimensional_Aarrays;
//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
import java.util.Arrays;
import java.util.Random;

public class Task2_13 {
    public void task2_13(int n){
        int temp;
        int[][] array  = generateArray.generateMAtrix(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){

                    for (int k = 0; k < n - 1; k++) {
                        if (array[k][i] > array[k + 1][i])
                        { temp = array[k][i];
                            array[k][i] = array[k + 1][i];
                            array[k + 1][i] = temp;
                        }}
                }
                else {
                    for (int k = 0; k < n - 1; k++) {
                        if (array[k][i] < array[k + 1][i])
                        { temp = array[k][i];
                            array[k][i] = array[k + 1][i];
                            array[k + 1][i] = temp;
                        }
                    }
                }
            }}
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

