/*
21. ��� ����� ���� (������������� ����� �����). ���������� ����������
���� � ���� ����, ��������, ��� ������� ��� ����������� 365 ����, � ��
�������� � 366 ����. ���������� ��������� ���, ��������� �� 4, ��
����������� ��� �����, ������� ������� �� 100 � �� ������� �� 400
(��������, ���� 300, 1300 � 1900 �� �������� �����������, � 1200 � 2000 �
��������).

22. ��� ����� ������ � ����� ����� � ��������� 1�12 (1 � ������, 2 �
������� � �. �.). ������� �������� ���������������� ������� ���� �
������, ��������, ����� � ������, ������� � ���� � �.�.
*/
package Javacoursehomework;

class Javacoursehomework_21_22Tasks {

    public static void main (String [] args) {
    int a =Integer.parseInt (args [0]);
    int b =Integer.parseInt (args [1]);
    task21 (a);
    task22 (b);
    }

    public static void task21 (int a) {
        if (a%100==0 && a%400==0) {
            System.out.println ("366 days");
        }
        else if (a<400 && a%4==0) {
            System.out.println ("366 days");
        }
        else {
            System.out.println ("365 days");
        }
    }

    public static void task22 (int b) {
        switch (b) {
            case 1:
                System.out.println ("������ - ����");
                break;
            case 2:
                System.out.println ("������� - ����");
                break;
            case 3:
                System.out.println ("���� - �����");
                break;
            case 4:
                System.out.println ("������ - �����");
                break;
            case 5:
                System.out.println ("��� - �����");
                break;
            case 6:
                System.out.println ("���� - ����");
                break;
            case 7:
                System.out.println ("���� - ����");
                break;
            case 8:
                System.out.println ("������ - ����");
                break;
            case 9:
                System.out.println ("�������� - �����");
                break;
            case 10:
                System.out.println ("������� - �����");
                break;
            case 11:
                System.out.println ("������ - �����");
                break;
            case 12:
                System.out.println ("������� - ����");
                break;
            default:
                System.out.println ("Man, you entered a wrong data");
            }
        
    }
}