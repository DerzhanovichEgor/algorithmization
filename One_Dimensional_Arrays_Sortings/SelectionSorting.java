package One_Dimensional_Arrays_Sortings;

import java.util.Arrays;
//3. Сортировка выбором. Дана последовательность чисел
//a1  a2  an
//.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место
public class SelectionSorting {
    public void sortByDecrease(int[] array){
        int max, temp;
        for (int i = 0; i < array.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] > array[max]){
                    max = j;
                }
            }
            temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
