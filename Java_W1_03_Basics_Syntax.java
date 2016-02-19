/*
1) Дана сторона квадрата a. Найти его периметр P = 4·a

2) Дана сторона квадрата a. Найти его площадь S = a^2

3) Даны стороны прямоугольника a и b. Найти его площадь 
S=a·b и периметр P = 2·(a + b). 

4) Дан диаметр окружности d. Найти ее длину L = ?·d. В 
качестве значения ? использовать 3.14
*/

class Java_W1_03_Basics_Syntax {
    public static void main (String [] args) {
        int a = Integer.parseInt (args [0]);
        int b = Integer.parseInt (args [1]);
        int d = Integer.parseInt (args [2]);
        firstTask (a);
        secondTask (a);
        thirdTask (a,b);
        fourthTask (d);
    }
    public static void firstTask (int a) {
        int P = a*4;
        System.out.println ("Perimeter = " + P);
    }
    public static void secondTask (int a) {
        int S = a*a;
        System.out.println ("Square = " + S);
    }
    public static void thirdTask (int a, int b) {
        int P = 2*(a+b);
        int S = a*b;
        System.out.println ("Perimeter = " + P);
        System.out.println ("Square = " + S);
    }
    public static void fourthTask (int d) {
        double Pi = 3.14;
        double D = d * Pi;
        System.out.println ("Diameter = " + D);
    }
}