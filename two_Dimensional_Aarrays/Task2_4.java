package two_Dimensional_Aarrays;
/*4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1,  2,   3   ... n
 n   n-1, n-2 ... 1
 1,  2,   3   ... n
 n   n-1, n-2 ... 1
 1,  2,   3   ... n
 n   n-1, n-2 ... 1
*/
public class Task2_4 {
    public void task2_4(int n){
        int[][] array = new int[n][n];
      /*  for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 9 + 1);
                // System.out.print(array[i][j] + " ");
            }
            //System.out.println();
        }*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2 == 0) {
                    array[i][j] = j + 1;
                }
                else{
                    array[i][j] = n - j  ;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
