package two_Dimensional_Aarrays;
//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
import java.util.Scanner;

public class Task2_3 {
    public void task2_3() {
        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = (int) (Math.random() * 9 + 1);
               // System.out.print(array[i][j] + " ");
            }
            //System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку от 0 до 5: ");
         int k = sc.nextInt();
        System.out.println("Введите столбец от 0 до 5: ");
         int p = sc.nextInt();
        System.out.println(k + " строка:");
        for (int i = 0; i < 6; i++)
            System.out.print(array[k][i] + " ");
        System.out.println("\n"+  k + " столбец:");
            for (int i = 0; i< 6; i++)
                System.out.print(array[i][p] + " ");


    }
}
