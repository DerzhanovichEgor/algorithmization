package One_Dimensional_Arrays_Sortings;

import java.util.Arrays;

public class InsertionSorting {


    public int[] insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int key = array[i];
            int j = Math.abs(binarySearch(array,0,i,key) + 1);
            System.arraycopy(array,j,array,j+1, i-j);
            array[j] = key;
        }
        return array;
    }

    private int binarySearch(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}