;
import java.util.Random;

//Создаем массим размерность lengthOfArray которую вводит пользователь и заполняем его случайными
//от 1 до 1000
public class ArrayForTests {
     Random rnd = new Random();
    public static int[] generateArray(int lengthOfArray) {
        int[] array = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = (int) (Math.random() * 1000 + 1);// rnd.nextInt(1000);
            //  System.out.println(i+ " " + array[i]);
        }
        return array;
    }
    //Создаем обычный массив от 1 до lengthOfArray
    public static int[] generateASimpleArray(int lengthOfArray){
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i;

        }
        return array;
    }

    }


