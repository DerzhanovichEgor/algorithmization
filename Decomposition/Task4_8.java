package Decomposition;
/* Задан массив D. Составить метод для вычисления суммы трех
последовательно расположеных элементов массива с номером
от k to m */
public class Task4_8 {
    public String task4_8(int k, int m,int[] array){
        int sum = 0;
        if(m > array.length || k > array.length){
           return "Введеные вами элементы больше длины массива";

        }
        for (int i = k; i < m; i++) {
            sum = sum + array[i];
        }
        return "Сумма элементов равна: " + sum;
    }
}
