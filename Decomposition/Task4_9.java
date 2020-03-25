package Decomposition;
/*9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
*/
public class Task4_9 {
    public void task4_8(double x,double y,double z,double t)
    {
        double diagonal,firstPartOfTriangle,secondPartOfTriangle, s;
        diagonal = Math.sqrt(x * x + y * y);
        firstPartOfTriangle = x * y * 0.5;
        secondPartOfTriangle = 0.25 * Math.sqrt((diagonal+z+t)*(diagonal+t-z)*(diagonal+z-t) * (z * t - diagonal));
        s = firstPartOfTriangle + secondPartOfTriangle;
        System.out.println("Площадь четырехугольника равна: " + s);
    }
}

