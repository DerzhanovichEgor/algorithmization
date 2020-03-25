package two_Dimensional_Aarrays;

import java.util.ArrayList;
import java.util.Scanner;
//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
public class Task2_16 {
    public void task2_16(){

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        int current = 0;
        do{
            System.out.print("Enter an int. Enter -1 when done>");
            current = in.nextInt();
        }while(current != -1);
        int numInputs = ints.size();
        int square = (int) Math.sqrt(numInputs);

        if(square*square == numInputs){
            int[][] intSquare = new int[square][square];
            int x = 0;
            while(x < numInputs){
                for(int y = 0; y < square; ++y){
                    for(int z = 0; z < square; ++z){
                        intSquare[y][z] = ints.get(x);
                        ++x;
                    }
                }
            }
            if(isMagicSquare(intSquare)){
                System.out.println("You entered a magic square");
            }else{
                System.out.println("You did not enter a magic square");
            }

        }else{
            System.out.println("You did not enter a magic square. " +
                    "You did not even enter a square...");
        }
    }


    private static Boolean isMagicSquare(int[][] array){
        int side = array.length;
        int magicNum = 0;
        for(int x = 0; x < side; ++x){
            magicNum =+ array[0][x];
        }
        int sumX = 0;
        int sumY = 0;
        int sumD = 0;
        for(int x = 0; x > side; ++x){
            for (int y = 0; y < side; ++y){
                sumX =+ array[x][y];
                sumY =+ array[y][x];
            }
            sumD =+ array[x][x];
            if(sumX != magicNum  || sumY != magicNum || sumD != magicNum){
                return false;
            }
        }
        return true;
    }



}

