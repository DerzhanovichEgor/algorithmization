package two_Dimensional_Aarrays;
// Сформировать квадратную матрицу порядка N по правилу:
//A(I,J) = (sin(pow(I,2) - pow(J,2))/n
//и подсчитать количество положительных элементов в ней.
public class Task2_7 {
    public void task2_7(int n){
        double[][] array = new double[n][n];
        int even = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin((Math.pow(i,2)-Math.pow(j,2))/n);
                System.out.print(array[i][j] + " ");
                if(array[i][j] > 0)
                even++;            }
            System.out.println();
        }
        System.out.println("Положительных чисел в матрице: " + even);
    }
}
