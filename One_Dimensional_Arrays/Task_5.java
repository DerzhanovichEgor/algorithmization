package One_Dimensional_Arrays;
//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
public class Task_5 {
    public void task1_5(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] > i){
                System.out.print(array[i] + " ");
            }
        }
    }
}
