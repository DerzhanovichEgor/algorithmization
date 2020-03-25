package One_Dimensional_Arrays;
//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
public class Task_2 {
    public int task1_2(int[] array, int z){
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > z){
                array[i] = z;
                count++;
            }
        }
        return count;
    }

}
