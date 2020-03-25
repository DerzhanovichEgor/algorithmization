package Decomposition;

import java.util.Scanner;

/*Написать метод(методы) для вычисления суммы факториалов всех неччетный чисел от 1 до 9*/
public class Task4_7 {
    public void task4_7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое нечетное число от 1 до 19 для подсчета суммы факториалов: ");
        int n = sc.nextInt();
        long sum = 0L;
        for (int i = 1; i <= n; i+=2) {
            sum = sum + factorial(i);
        }
        System.out.println(sum);

    }
    private long factorial(long n){
        return n==0 ? 1 : n * factorial(n -1 );
    }
}
