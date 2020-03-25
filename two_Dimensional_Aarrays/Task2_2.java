package two_Dimensional_Aarrays;

import java.util.Arrays;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2_2 {
    public int[][] task2_2(int n, int m){
        int[][] array = new int[n][m];
     for (int i = 0; i < n; i++) {
          for (int j = 0; j < m ; j++) {
               array[i][j] =  (int)(Math.random() * 9 + 1);
             System.out.print(array[i][j] + " ");
           }
        System.out.println();
       }
        System.out.println();

        for (int i = 0; i < n ; i++) {
            for (int j = i; j < m; j++) {
                if(i > j - 1)
                System.out.print(array[i][j] + " ");
            }

        }

        return array;
    }
}
