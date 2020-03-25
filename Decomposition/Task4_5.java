package Decomposition;
//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).
public class Task4_5 {
    public void task4_5(int[] array){
        int max = 0,secondMax = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                secondMax = max;
                max = array[i];
            }else if(array[i] > secondMax){
                secondMax = array[i];
            }
        }
        System.out.println(max + " " + secondMax);

    }
}
