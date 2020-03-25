package Decomposition;
/*Написать метод, проверяющий являются ли данные три числа взаимно простыми*/

public class Task4_6 {
    public void task4_6(int a, int b, int c){
        Task4_1 nod = new Task4_1();
        if(nod.findNOD(nod.findNOD(a,b),c) == 1){
            System.out.println("Данные числа являются взаимно простыми!");
        }
        else {
            System.out.println("Данные числа не являются взаимно простыми!");
        }

    }
}
