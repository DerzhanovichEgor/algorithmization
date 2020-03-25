package One_Dimensional_Arrays;
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
import java.util.Scanner;

public class Task_1 {
    public int task1_1(int array[], int k){
        int sum  = 0;
        for(int i = 0; i< array.length; i++){
           if(array[i]%k==0){
               sum +=array[i];
           }
        }
        return sum;
    }
}
