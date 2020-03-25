package Decomposition;
//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Task4_2 {
    public void task4_2(int a, int b, int c, int y) {
        int nod = 1;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && y % i == 0) {
                nod = i;
                break;
            }


        }
        System.out.println("Наибольший общиий делитель(НОД" + nod);
    }
}
