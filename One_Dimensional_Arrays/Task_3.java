package One_Dimensional_Arrays;
//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов

public class Task_3 {
    public void task1_3(int[] array){
        int countNull = 0,
            countOdd = 0,
            countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                countNull++;
            }else if(array[i] < 0){
                countOdd++;
            }else if(array[i] > 0){
                countEven++;
            }

        }
        System.out.println("Положительных элементов: " + countEven +
                           " | нулевых элементов: " + countNull +
                           " | отрицательных элементов: " + countOdd);

    }
}
