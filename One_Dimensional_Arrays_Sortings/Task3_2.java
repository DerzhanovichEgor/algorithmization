package One_Dimensional_Arrays_Sortings;
//2. Даны две последовательности
//a1  a2  an и b1  b2  bm
//. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
import java.util.Arrays;

public class Task3_2 {
    public int[] task3_2(int[] fArray, int[] sArray)
    {
        int n = fArray.length;
        int j = 0;
        fArray = Arrays.copyOf(fArray, fArray.length + sArray.length);
        for (int i = n; i < fArray.length; i++) {
            fArray[i] = sArray[j++];
        }
        Arrays.sort(fArray);
        return fArray;
    }
}
