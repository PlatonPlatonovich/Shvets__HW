/*
5.Дано число A. Вычислить A^8, используя вспомогательную переменную и три
операции умножения. Для этого последовательно находить A^2, A^4, A^8.
Вывести все найденные степени числа A.

6.Дано значение температуры T в градусах Фаренгейта. Определить значение
этой же температуры в градусах Цельсия. Температура по Цельсию TC и
температура по Фаренгейту TF связаны следующим соотношеним:
TC=(TF–32)·5/9.

7.Дано значение температуры T в градусах Цельсия. Определить значение этой
же температуры в градусах Фаренгейта. Температура по Цельсию TC и
температура по Фаренгейту TF связаны следующим соотношением:
TC=(TF–32)·5/9. Ввод температуры организовать через параметры командной строки.
*/
package Javacoursehomework;

class Javacoursehomework_5_7Tasks {
    public static void main (String [] args) {
        int A = Integer.parseInt (args [0]);
        double T = Double.parseDouble (args [1]);
        double TC = Double.parseDouble (args [2]);
        fifthTask (A);
        sixTask (T);
        likeSix (TC);
    }
    public static void fifthTask (int A) {
        A = A * A;
        System.out.println ("A^2 = " + A);
        A = A * A;
        System.out.println ("A^4 = " + A);
        A = A * A;
        System.out.println ("A^8 = " + A);
    }
    public static void sixTask (double T) {
        double TC = (T - 32)*5/9;
        System.out.println (T + " fahrenheit degree is equal to " + TC + "celsius degree");
    }
    public static void likeSix (double TC) {
        double T = TC/5*9+32;
        System.out.println (T + " fahrenheit degree is equal to " + TC + "celsius degree");
    }
}