package Decomposition;
//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.
import java.util.Arrays;

public class Task4_12 {
    public int[] task4_12(int k, int n){
        int[] array = new int[n];
        int element = 0;
        int lengthOfNewArray = 0;
        for (int i = 0; i <= n; i++) {
            if(sum(i) == k){
                array[element++] = i;
                lengthOfNewArray++;

            }
        }
         array = Arrays.copyOf(array,lengthOfNewArray);
        return array;
    }

    private int sum(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n = n/10;
        }
        return sum;
    }
}
