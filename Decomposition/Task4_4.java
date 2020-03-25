package Decomposition;

import java.util.Scanner;
/* На плоскости заданы своими ккоординатами n точек. Написать метод(методы),
 определяющие, между какими точками самое большое расстояние
 Координаты занести в массив*/
public class Task4_4 {
    public int[] makeArrayOfCoordinats(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Введите координаты этих точек: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;

    }

    public void task4_4(){
        int[] array = makeArrayOfCoordinats();
        int distance = 0,max = 0, element = 0;
        for (int i = 0; i < array.length - 1; i++) {
            distance = Math.abs(array[i] - array[i + 1]);
            if(distance > max){
                max = distance;
                element = i;
            }
        }
        System.out.println("Между точой с координатой " + array[element] + " и точкой с координатой "
                + array[element + 1] + " наибольшее расстояние");
    }
}
