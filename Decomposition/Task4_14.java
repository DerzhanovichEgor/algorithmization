package Decomposition;
//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.
public class Task4_14 {
    private int getSum(int n){
      int[] array = getSizeOfArray(n);
        int pow = array.length, sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i],pow);
        }
        return sum;

    }
    public void findArmstrongNumber(int amstrongNumber){
        for (int i = 1; i <= amstrongNumber; i++) {
            if(getSum(i) == i){
                System.out.println("Число: " + i + " является числом Армстронга");
            }
        }
    }
    private int[] getSizeOfArray(int n){
        Tools t = new Tools();
        int[] array = new int[t.findLength(n)];
        for (int i = 0; i <array.length ; i++) {
            array[i] = n%10;
            n = n/10;
        }
        return array;
    }
}
