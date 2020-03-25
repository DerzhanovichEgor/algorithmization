package Decomposition;
//метод возвращает количество цифр содержащихся в числе number
public class Tools {
    public int findLength(int number){
        int count = 0;
        while (number > 0) {
            count++;
            number/=10;
        }
        return count;
    }
    //метод возвращает массив в ккотором содержатся цифры числа n
    public int[] getArrayOfNumbers(int n) {
        int[] array = new int[findLength(n)];
        for (int i = 0; n > 0; i++) {
            array[i] = n % 10;
            n = n / 10;
        }

        return array;
    }
}
