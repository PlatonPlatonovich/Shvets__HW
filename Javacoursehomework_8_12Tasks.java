/*
8.Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем
— его правую цифру (единицы). Для нахождения десятков использовать
операцию деления нацело, для нахождения единиц — операцию взятия остатка
от деления.

9.Дано двузначное число. Найти сумму и произведение его цифр.

10. Дано двузначное число. Вывести число, полученное при перестановке
цифр исходного числа.

11. Решить предыдущую задачу, не использую никаких дополнительных
переменных.

12. Дано трехзначное число. Найти сумму и произведение его цифр.
*/

class Javacoursehomework_8_12Tasks {
    public static void main (String [] args) {
        int a = Integer.parseInt (args [0]);
        int b = a/10;
        int c = a%10;
        int d = Integer.parseInt (args [1]);
        int d1 = d%10;
        int d2 = (d%100)/10;
        int d3 = d/100;
            task8 (b,c);
            task9 (b,c);
            task10 (b,c);
            task11 (a);
            task12 (d1,d2,d3);
    }
    public static void task8 (int b, int c) {
        System.out.println ("Left side of the entered number is "+b+". However right side is"+c);
    }
    public static void task9 (int b, int c) {
        int summ = b + c;
        int composition = b*c;
        System.out.println ("Their summ will be "+summ+". Meanwhile composition is"+composition);
    }
    public static void task10 (int b, int c) {
        int d = c*10+b;
        System.out.println ("New number is "+d);
    }
    public static void task11 (int a) {
        a = a%10*10+a/10;
        System.out.println ("New number is "+a);
    }
    public static void task12 (int d1,int d2,int d3) {
        int summ = d1+d2+d3;
        int composition = d1*d2*d3;
        System.out.println ("Their summ will be "+summ+". Meanwhile composition is"+composition);
    }
}