package One_Dimensional_Arrays;
//7. Даны действительные числа a1,a2...n. Найти
//max(a1 + a2n a2 + a2n−1  an + an+1)
//.
public class Task_7 {
    public int task_7(int[] array){

        int max = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length/2 ; i++) {
            if(max<(array[i] + array[array.length - i - 1])){
                max = array[i] + array[array.length - i - 1];
            }
        }

        return max;
    }
}
