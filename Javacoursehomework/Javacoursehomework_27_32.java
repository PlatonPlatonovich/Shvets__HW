/*
27. ���� ��� ����� ����� A � B (A < B). ����� ����� ���� ����� ����� ��
A �� B ������������.

28. ���� ��� ����� ����� A � B (A < B). ����� ������������ ���� �����
����� �� A �� B ������������.

29. ���� ��� ����� ����� A � B (A < B). ����� ����� ��������� ���� �����
����� �� A �� B ������������.

30. ���� ������������ ����� A � ����� ����� N (> 0). ��������� ����
����, ����� �������� ��������� 1 � A + A2 � A3 + ... + (�1)N�AN. ��������  
�������� �� ������������.

31. ���� ����� ����� N (> 0). ����� ������������ N! = 1�2�...�N
(N����������). ����� �������� �������������� ������������, ��������� ���
������������ � ������� ������������ ���������� � ������� ��� ���
������������ �����.

32. ���� ����� ����� N (> 1). ������������������ ����� ��������� FK (������ ����) ������������ ��������� �������: F1 = 1, F2 = 1, FK = FK�2 +
FK�1, K = 3, 4, ... . ������� �������� F1, F2, ..., FN.
*/
package Javacoursehomework;

import java.lang.Math;
import java.util.Arrays;

class Javacoursehomework_27_32 {

    public static void main (String [] args) {
    int A = Integer.parseInt (args[0]);
    int B = Integer.parseInt (args[1]);
    double a = Double.parseDouble (args [2]);
    int N = Integer.parseInt (args[3]);
    task27 (A, B);
    task28 (A, B);
    task29 (A, B);
    task30 (a, N);
    task31 (N);
    task32 (N);
    }

    public static void task27 (int A, int B) {
    int sum = 0;
        for (int i=A;i<=B;i++) {
            sum = sum + i;
        }
    System.out.println ("Summ of all elements is "+sum);
    }

    public static void task28 (int A, int B) {
    int comp = 1;
        for (int i=A;i<=B;i++) {
            comp = comp * i;
        }
    System.out.println ("Composition of all elements is "+comp);
    }

    public static void task29 (int A, int B) {
        int sum = 0;
        for (int i=A;i<=B;i++) {
            sum= sum + i*i;
        }
    System.out.println ("Result of summing is "+sum);
    }

    public static void task30 (double a, int N) {
        double sum = 0;
        for (int i=0;i<=N;i++) {
            sum =sum + Math.pow((-a),(double)i);
        }
    System.out.println ("Result is "+sum);
    }

    public static void task31 (int N) {
        int fact = 1;
        for (int i=1;i<=N;i++) {
            fact=fact*i;
        }
    System.out.println ("Factorial N is "+fact);
    }

    public static void task32 (int N) {
        int [] fibonachi= new int[N];
        fibonachi[0]=3;
        fibonachi[1]=4;
        for (int i=2;i<=(N-1);i++) {
            fibonachi[i]=fibonachi[i-1]+fibonachi[i-2];
        }
    System.out.println (Arrays.toString(fibonachi));
    }

}