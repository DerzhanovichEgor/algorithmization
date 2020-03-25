package Decomposition;
//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.
public class Task4_10 {


    public int[] taskr4_10(int number){
        int[] array = new int[new Tools().findLength(number)];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number%10;
            number /= 10;

        }
        return array;

    }
}
