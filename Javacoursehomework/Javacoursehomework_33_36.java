package Javacoursehomework;
/*

33. ��������� ����� � ����� ����� 1000 ���. ����� ������ ����� ������
������ ������������� �� P ��������� �� ��������� ����� (P � ������������
�����, 0 < P < 25). �� ������� P ����������, ����� ������� ������� ������
������ �������� 1100 ���., � ������� ��������� ���������� ������� K
(����� �����) � �������� ������ ������ S (������������ �����).

34. ���� ����� ����� N (> 0). ��������� �������� ������� ������ � ������
������� �� �������, ������� ��� ��� �����, ������� � ����� ������
(������� ������).

35. ���� ����� ����� N (> 1). ���� ��� �������� �������, �� ���� ��
����� ������������� ���������, ����� 1 � ������ ����, �� ������� True,
����� ������� False.

36. ���� ����� ����� N (> 1). ������������������ ����� ��������� FK
������������ ��������� �������: F1 = 1, F2 = 1, FK = FK�2 + FK�1, K = 3, 4, ...
. ���������, �������� �� ����� N ������ ���������. ���� ��������, ��
������� True, ���� ��� � ������� False.
*/

public class Javacoursehomework_33_36 {

    public static void main (String [] args) {
        float P = Float.parseFloat (args [0]);
        int N = Integer.parseInt (args [1]);
        task33(P);
        task34(N);
        task35(N);
        task36(N);
    }

    public static void task33 ( double P) {
        int b = 1000;
        double S =(double)b;
        int K = 0;
        do {
            S=S+1000*(P/100);
            K=K+1;
        }
        while (S<1100);
        System.out.println("������ ������ �������� 1100 ���. ����� "+K+" ������� � ��������"+S);
    }
    public static void task34 (int N) {
        int i =10;
        int j =1;
        do {
            int num =N%i/j;
            i=i*10;
            j=j*10;
            System.out.println (num);
        }
        while (N>(i/10));
    }
    public static void task35 (int N) {
        boolean m;
        int b = 0;
        for (int i=1; i<=N; i++) {
            if (((double)N/(double)i)%1==0) {
                b = b+1;
            }
            else {
            }
        }
        m = b==2;
        System.out.println (m);
    }
    public static void task36 (int N) {
    	boolean a = true;
        int [] fibon = new int [N];
        fibon[0] = 1;
        fibon[1] = 1;
        for(int i = 2; i<N; i++) {
            fibon[i] = fibon[i-2]+fibon[i-1];
            if(fibon[i] == N) {
                System.out.println (a);
                break ;
            }
            else {
            }
            System.out.println (!a);
        }
    }        
}