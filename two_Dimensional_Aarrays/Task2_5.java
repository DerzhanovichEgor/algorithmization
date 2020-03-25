package two_Dimensional_Aarrays;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1   1   1...1  1  1
2   2   2...2  2  0
3   3   3...3  0  0
n-1 n-1 0...0  0  0
n   0   0...0  0  0
 */
public class Task2_5 {
    public void trask2_5(int n){
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                array[i][j] = i+1;

                if(j >= n - i )
                    array[i][j] = 0;
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
