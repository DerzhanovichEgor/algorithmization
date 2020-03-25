package One_Dimensional_Arrays_Sortings;
//4. Сортировка обменами. Дана последовательность чисел
//a1  a2  an
//.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа
//i i+1 a и a
//. Если
//ai > ai+1
//, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
import java.util.Arrays;

public class BubbleSort {
    public void sorting(int[] array){
        int temp,count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i ; j++) {

                if(array[j] < array[j + 1]){
                 temp = array[j + 1];
                 array[j + 1] = array[j];
                 array[j] = temp;
                    count++;

                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
