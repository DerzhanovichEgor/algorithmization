package Decomposition;
//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.
import java.util.Scanner;

public class Task4_13 {
    private int getN(int[] array) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число большее 2 и меньше " + array.length / 2);
        do {
            n = sc.nextInt();
            if (n >= 2 && n <= array.length) {
                break;
            }
            System.out.println("Вы ввели неверное число, попробуйте снова: ");

        } while (true);
        return n;
    }

public void task4_13(int[] array) {
       int n = getN(array);
    for (int i = n; i < 2 * n; i++) {
        for (int j = i; j < n * 2; j++) {
            if (Math.abs(array[i] - array[j]) == 2) {
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }
}


}
