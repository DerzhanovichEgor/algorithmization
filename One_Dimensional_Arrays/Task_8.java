package One_Dimensional_Arrays;
//8. Дана последовательность целых чисел
//a1 a2... an
// Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min( a1,a2... an)

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class Task_8 {
    public int[] task_8(int[] array){


        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if( min > array[i]){
                min = array[i];
            }
        }
        int[] array1 = new int[array.length];

        for (int i = 0; i <array1.length; i++) {
            if(array[i] != min){

                array1[i] = array[i];
            }
        }
        System.out.println(min);
        return array1;
    }
}
