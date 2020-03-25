package Decomposition;
//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.
public class Task4_3 {
    public double areaOfTriangle(int a ){
        double s = (a*a *Math.sqrt(3))/4;
        return s;
    }
    public void task4_3(int a){
        double S = 6 * areaOfTriangle(a);
        System.out.println("Площадь треугольника равна: " + S);
    }
}
