/*
5.���� ����� A. ��������� A^8, ��������� ��������������� ���������� � ���
�������� ���������. ��� ����� ��������������� �������� A^2, A^4, A^8.
������� ��� ��������� ������� ����� A.

6.���� �������� ����������� T � �������� ����������. ���������� ��������
���� �� ����������� � �������� �������. ����������� �� ������� TC �
����������� �� ���������� TF ������� ��������� �����������:
TC=(TF�32)�5/9.

7.���� �������� ����������� T � �������� �������. ���������� �������� ����
�� ����������� � �������� ����������. ����������� �� ������� TC �
����������� �� ���������� TF ������� ��������� ������������:
TC=(TF�32)�5/9. ���� ����������� ������������ ����� ��������� ��������� ������.
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