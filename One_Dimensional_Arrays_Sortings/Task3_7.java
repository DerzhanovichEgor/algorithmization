package One_Dimensional_Arrays_Sortings;
/*
7. Пусть даны две неубывающие последовательности действительных чисел
a1  a2 an и b1  b2bm
.
Требуется указать те места, на которые нужно вставлять элементы последовательности
b1  b2  bm
в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3_7 {
    public void task3_7(){
        List<Integer> in = new ArrayList<Integer>() {
            {add(0); add(2); add(4); add(6); add(8); add(10);}
        };

        List<Integer> from = new ArrayList<Integer>() {
            {add(1); add(3); add(5); add(7); add(9);}
        };

        List<Integer> indexes = gimmeIndexes(in, from);
        System.out.println("Куда нужно вставлять, с учетом вставки слева направо " + indexes);

        for (int i = 0; i < indexes.size(); i++)
            in.add(indexes.get(i), from.get(i));
        System.out.println("После вставки "+ in);
    }

    private static List<Integer> gimmeIndexes(List<Integer> in, List<Integer> from) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) result.add(-(dex + 1) + i);
            else result.add(dex + i);
        }
        return result;
    }
}


