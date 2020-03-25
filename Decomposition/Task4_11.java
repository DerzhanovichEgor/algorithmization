package Decomposition;
//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task4_11 {
    public void task4_11(int k, int n){
        Tools t = new Tools();
        int firstNum = t.findLength(k);
        int secNum = t.findLength(n);
        if(firstNum > secNum){
            System.out.println("В числе " + k + " больше цифр чем в числе " + n);
        }else if(secNum > firstNum)
            System.out.println("В числе " + n + " больше цифр чем в числе " + k);
        else
            System.out.println("В числах одинаковое количество цифр.");
    }

}
