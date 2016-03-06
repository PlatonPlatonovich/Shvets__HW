/*
15. Дано целое положительное число. Проверить истинность высказывания:
«Данное число является нечетным трехзначным».

16. Дано трехзначное число. Проверить истинность высказывания: «Цифры
данного числа образуют возрастающую последовательность».
a.Проверить истинность высказывания: «Цифры данного числа образуют
возрастающую арифметическую последовательность», например, 123, 456
и т.п.

17. Дано четырехзначное число. Проверить истинность высказывания:
«Данное число читается одинаково слева направо и справа налево» (т.е.
является палиндромом)

18. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2
(целые числа, лежащие в диапазоне 1–8). Проверить истинность
высказывания: «Данные поля имеют одинаковый цвет».

19. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2
(целые числа, лежащие в диапазоне 1–8). Проверить истинность
высказывания: «Ладья за один ход может перейти с одного поля на другое».

20. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2
(целые числа, лежащие в диапазоне 1–8). Проверить истинность
высказывания: «Ферзь за один ход может перейти с одного поля на другое».
*/
import java.lang.Math;

class Javacoursehomework_15_20Tasks {

    public static void main (String [] args) {
    int a = Integer.parseInt (args [0]);
    int b = Integer.parseInt (args [1]);
    int c = Integer.parseInt (args [2]);
    int d = Integer.parseInt (args [3]);
    int e = Integer.parseInt (args [4]);
    int f = Integer.parseInt (args [5]);
    int g = Integer.parseInt (args [6]);
    task15 (a);
    task16 (b);
    task17 (c);
    task18 ();
    task19 (d,e,f,g);
    task20 (d,e,f,g);
    }

    public static void task15 (int a) {
        if (a/1000==0 && a%2!=0) {
            System.out.println ("Данное число является нечетным трехзначным");
        }
        else {
            System.out.println ("Данное число либо четное, либо не трехзначное");
        }
    }

    public static void task16 (int b) {
        if (b/100 < b/10%10 && b/10%10 < b%100) {
            System.out.println ("Цифры данного числа образуют возрастающую арифметическую последовательность");
        }
        else {
            System.out.println ("Цифры данного числа не образуют возрастающую арифметическую последовательность");
        }
    }

    public static void task17 (int c) {
        if (c/1000==c%10 && c/100%10==c/10%10) {
            System.out.println ("Данное число читается одинаково слева направо и справа налево");
        }
        else {
            System.out.println ("Данное число не читается одинаково слева направо и справа налево");
        }
    }

    public static void task18 () {
        char [][] xy = new char[8][8];
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                if ((i+j)%2==0) {
                    xy[i][j] = '0';
                    System.out.print (xy[i][j]+"\t");
                }
                else {
                    xy[i][j] = '#';
                    System.out.print (xy[i][j]+"\t");
                }
            }
        }
        System.out.println();
        outer: for (int i = 1; i < 8; i++) {
            inner: for (int j = 0; j < 7; j++) {
                if (xy[i][j]!=xy[i][j+1] && xy[i][j]!=xy[i-1][j]) {
                    System.out.println ("Данные поля не имеют одинаковый цвет");
                    break outer;
                }
                else if ((i+j)==13) {
                    System.out.println ("Данные поля имеют одинаковый цвет");
                }
            }
        }
    }
    public static void task19 (int d, int e, int f, int g) {
        int i = 8;
        int j = 8;
        if (d>i || e>j || f>i || g>j ) {
            System.out.println ("Данные введены неверно!");
        }
        else {
        }
        if (d==f && e==g) {
            System.out.println ("Ладья осталась на месте");
        }
        else if (d==f && e!=g) {
            System.out.println ("Ладья за один ход может перейти с одного поля на другое");
        }
        else if (d!=f && e==g) {
            System.out.println ("Ладья за один ход может перейти с одного поля на другое");
        }
        else {
            System.out.println ("ERROR");
        }
    }

    public static void task20 (int d, int e, int f, int g) {
        int i = 8;
        int j = 8;
        if (d>i || e>j || f>i || g>j ) {
            System.out.println ("Данные введены неверно!");
        }
        else {
        }
        if (d==f && e==g) {
            System.out.println ("Ферзь осталась на месте");
        }
        else if (d==f && e!=g) {
            System.out.println ("Ферзь за один ход может перейти с одного поля на другое");
        }
        else if (d!=f && e==g) {
            System.out.println ("Ферзь за один ход может перейти с одного поля на другое");
        }
        else if (d!=f && e==g) {
            System.out.println ("Ферзь за один ход может перейти с одного поля на другое");
        }
        else if (Math.abs(d-f) == Math.abs(e-g)) {
            System.out.println ("Ферзь за один ход может перейти с одного поля на другое");
        }
        else {
            System.out.println ("ERROR");
        }
    } 
}