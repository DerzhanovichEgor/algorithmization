package Decomposition;
//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Task4_17 {
    private int getSum(int n ){
        Tools t = new Tools();
        int sum = 0;
        int[] array = t.getArrayOfNumbers(n);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public void task4_17(int n){
        int result = n;
        int count = 0;
        while(result > 0){
            result = result - getSum(result);
            count++;
        }
        System.out.println("Вычитая сумму цифр из числа: " + n + " мы произвели " + count + " действия(й), чтобы получить число 0");
    }

}
