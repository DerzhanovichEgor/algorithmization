package One_Dimensional_Arrays;

import java.util.Arrays;
//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task_10 {
public int[] task_10(int[] array){
    if (array.length < 2)
        return array;

    int count = 1;
    if (array.length > 2) {

        for (int i = 2; i < array.length; i+= 2) {
            array[count] = array[i];
            count++;
        }

        if (array.length % 2 == 0) {
            array = Arrays.copyOf(array, array.length / 2);
        }
        else {
            array = Arrays.copyOf(array, array.length / 2 + 1);
        }
    }
    else {
        array = Arrays.copyOf(array, array.length / 2);
    }

    return array;
}
}
