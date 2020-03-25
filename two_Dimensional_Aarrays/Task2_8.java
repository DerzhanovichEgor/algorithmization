package two_Dimensional_Aarrays;
/*
8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
import sun.font.FontRunIterator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2_8 {
    public void task2_8(int n){
        int temp;
        Random rnd = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rnd.nextInt(10);

            }

        }

        //System.out.println(Arrays.deepToString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер столбца, от 1 до " + n);
        int firstColumn = sc.nextInt();
        System.out.println("Введите номер второго столбца от 1 до  " + n);
        int secondColumn = sc.nextInt();

        System.out.println("Before swap");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < n; j++) {
                if (i == firstColumn) {
                    temp = array[j][firstColumn - 1];
                    array[j][firstColumn -1 ] = array[j][secondColumn - 1];
                    array[j][secondColumn - 1] = temp;

                }
            }

        }
        System.out.println("After");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
      //  System.out.println(Arrays.deepToString(array));
    }
}
