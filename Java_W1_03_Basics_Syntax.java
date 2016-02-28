/*
1) ���� ������� �������� a. ����� ��� �������� P = 4�a

2) ���� ������� �������� a. ����� ��� ������� S = a^2

3) ���� ������� �������������� a � b. ����� ��� ������� 
S=a�b � �������� P = 2�(a + b). 

4) ��� ������� ���������� d. ����� �� ����� L = ?�d. � 
�������� �������� ? ������������ 3.14
*/

class Java_W1_03_Basics_Syntax {
    public static void main (String [] args) {
        double a = Double.parseDouble (args [0]);
        double b = Double.parseDouble (args [1]);
        double d = Double.parseDouble (args [2]);
        firstTask (a);
        secondTask (a);
        thirdTask (a,b);
        fourthTask (d);
    }
    public static void firstTask (double a) {
        double P = a*4;
        System.out.println ("Perimeter = " + P);
    }
    public static void secondTask (double a) {
        double S = a*a;
        System.out.println ("Square = " + S);
    }
    public static void thirdTask (double a, double b) {
        double P = 2*(a+b);
        double S = a*b;
        System.out.println ("Perimeter = " + P);
        System.out.println ("Square = " + S);
    }
    public static void fourthTask (double d) {
        double Pi = 3.14;
        double D = d * Pi;
        System.out.printf ("Diameter %.2f", D);
    }
}