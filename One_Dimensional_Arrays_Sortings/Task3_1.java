package One_Dimensional_Arrays_Sortings;
//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task3_1 {
    public int[] trask3_1(int[] firstArray, int[] secondArray) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс для вставки массива от 1 до " + (firstArray.length - 1));
        int k = sc.nextInt();
        firstArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
       int n = firstArray.length;
        for (int i = 0  ; i < secondArray.length; i++) {
            firstArray[k + i] = secondArray[i];
            for (int j = k + secondArray.length ; j < firstArray.length; j++) {
                firstArray[j] = j - i - 1;
            }

        }

        return firstArray;
    }
}
