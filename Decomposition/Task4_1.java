package Decomposition;
//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:
public class Task4_1 {
    public int findNOD(int a, int b){
        int nod = 1;
        for (int i = a; i > 0 ; i--) {
            if(a%i == 0 && b%i == 0) {
                nod = i;
                break;
            }


        }
        System.out.println();
        return nod;
    }
    public void task4_1(int a, int b){
        int nod = findNOD(a,b);
        int nok = (a * b) / nod;
        System.out.println("Наименьшее общее кратное(НОК): " + nok);
        System.out.println("Наибольший общий делитель(НОД): " + nod);
    }
}
