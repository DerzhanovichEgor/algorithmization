package two_Dimensional_Aarrays;
//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
/*
1 1 1 ... 1 1 1
0 1 1 ... 1 1 0
0 0 1 ... 1 0 0
0 0 1 ... 1 0 0
0 1 1 ... 1 1 0
1 1 1 ... 1 1 1
 */
public class Task2_6 {
    public void task2_6(int n){
            int[][] array = new int[n][n];
               for (int i = 0; i < n; i++) {
                for (int j = 0; j <n; j++) {
                    if((j>=i && j<n-i) || (j<=i && j>=n-i-1))
                        array[i][j] = 1;
                    else array[i][j] = 0;
                    System.out.print(array[i][j] + " ");

                }
                System.out.println();
            }
        }

    }
