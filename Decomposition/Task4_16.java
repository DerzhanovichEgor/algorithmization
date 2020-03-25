package Decomposition;
//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
public class Task4_16 {
    public void task4_16(int number){
        int sum = 0;
        Tools t = new Tools();
        int[] array = t.getArrayOfNumbers(number);
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.println("Число: " + number + " содержит четные цифры");
                break;
            }else
            {
                sum += array[i];
            }
        }
        System.out.println("Сумма нечетный цифр числа: " + number + " равна " + sum);
        System.out.println("В найденной сумме число четных цифр равно: " + findEvenNumbers(sum));
    }

    private int findEvenNumbers(int number){
        Tools t = new Tools();
        int count = 0;
        int[] array = t.getArrayOfNumbers(number);
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
