/*
13. � ������ ����� ������ N ������ (N � �����). ����� ���������� ������
�����, ����� � ������, ��������� � ������ ���������� ����.

14. ��� ������ ������������� ��������� �������: 1 � �����������, 2 �
�������, ..., 6 � �������, 7 � �����������. ���� ����� ����� K, ������� �
��������� 1�365. ���������� ����� ��� ������ ��� K��� ��� ����, ����
��������, ��� � ���� ���� 1 ������ ���� ������.
*/
package Javacoursehomework;

class Javacoursehomework_13_14Tasks {
    public static void main (String [] args){
        int N = Integer.parseInt (args [0]);
        int K = Integer.parseInt (args [1]);
        task13 (N);
        task14 (K);
    }
    public static void task13 (int N) {
        int min = N/60;
        int hour = N/3600;
        int seclasthour = N%3600;  
        int minlasthour = seclasthour/60;
        System.out.println ("Amount of minutes is: "+min);
        System.out.println ("Amount of hours is: "+hour);
        System.out.println ("Amount of second(last hour) is: "+seclasthour);
        System.out.println ("Amount of minutes(last hour) is: "+minlasthour);
    }
    public static void task14 (int K) {
        while (K>7 && K <= 365) {
            K = K - 7;
        }
        if (K == 1) {
            System.out.println("3. Wensday");
        }
        else if (K == 2) {
            System.out.println("4. Thursday");
        }
        else if (K == 3) {
            System.out.println("5. Friday");
        }
        else if (K == 4) {
            System.out.println("6. Saturday");
        }
        else if (K == 5) {
            System.out.println("7. Sunday");
        }
        else if (K == 6) {
            System.out.println("1. Monday");
        }
        else if (K == 7) {
            System.out.println("2. Tuesday");
        }
        else {
            System.out.println("������ ������� �������!!!");
        }
    }
}