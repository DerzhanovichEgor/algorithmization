package Decomposition;
//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Task4_15 {


    public void task4_15(int n) {
        Tools t = new Tools();
        int count = 1;
        int[] array = t.getArrayOfNumbers(n);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
                break;
            else if ((array[i] > array[i + 1]) && ((array[i] - array[i + 1]) == 1)) {
                count++;
            }
        }
        if(count == array.length){
            System.out.println("Цифры числа: " + n + "  образуют строгую последовательность");
        }else
            System.out.println("Цифры числа: " + n + "  НЕ образуют строгую последовательность");
    }
}

