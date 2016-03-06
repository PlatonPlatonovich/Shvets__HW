/*
15. ���� ����� ������������� �����. ��������� ���������� ������������:
������� ����� �������� �������� �����������.

16. ���� ����������� �����. ��������� ���������� ������������: ������
������� ����� �������� ������������ �������������������.
a.��������� ���������� ������������: ������ ������� ����� ��������
������������ �������������� �������������������, ��������, 123, 456
� �.�.

17. ���� �������������� �����. ��������� ���������� ������������:
������� ����� �������� ��������� ����� ������� � ������ ������ (�.�.
�������� �����������)

18. ���� ���������� ���� ��������� ����� ��������� ����� x1, y1, x2, y2
(����� �����, ������� � ��������� 1�8). ��������� ����������
������������: ������� ���� ����� ���������� ����.

19. ���� ���������� ���� ��������� ����� ��������� ����� x1, y1, x2, y2
(����� �����, ������� � ��������� 1�8). ��������� ����������
������������: ������ �� ���� ��� ����� ������� � ������ ���� �� ������.

20. ���� ���������� ���� ��������� ����� ��������� ����� x1, y1, x2, y2
(����� �����, ������� � ��������� 1�8). ��������� ����������
������������: ������ �� ���� ��� ����� ������� � ������ ���� �� ������.
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
            System.out.println ("������ ����� �������� �������� �����������");
        }
        else {
            System.out.println ("������ ����� ���� ������, ���� �� �����������");
        }
    }

    public static void task16 (int b) {
        if (b/100 < b/10%10 && b/10%10 < b%100) {
            System.out.println ("����� ������� ����� �������� ������������ �������������� ������������������");
        }
        else {
            System.out.println ("����� ������� ����� �� �������� ������������ �������������� ������������������");
        }
    }

    public static void task17 (int c) {
        if (c/1000==c%10 && c/100%10==c/10%10) {
            System.out.println ("������ ����� �������� ��������� ����� ������� � ������ ������");
        }
        else {
            System.out.println ("������ ����� �� �������� ��������� ����� ������� � ������ ������");
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
                    System.out.println ("������ ���� �� ����� ���������� ����");
                    break outer;
                }
                else if ((i+j)==13) {
                    System.out.println ("������ ���� ����� ���������� ����");
                }
            }
        }
    }
    public static void task19 (int d, int e, int f, int g) {
        int i = 8;
        int j = 8;
        if (d>i || e>j || f>i || g>j ) {
            System.out.println ("������ ������� �������!");
        }
        else {
        }
        if (d==f && e==g) {
            System.out.println ("����� �������� �� �����");
        }
        else if (d==f && e!=g) {
            System.out.println ("����� �� ���� ��� ����� ������� � ������ ���� �� ������");
        }
        else if (d!=f && e==g) {
            System.out.println ("����� �� ���� ��� ����� ������� � ������ ���� �� ������");
        }
        else {
            System.out.println ("ERROR");
        }
    }

    public static void task20 (int d, int e, int f, int g) {
        int i = 8;
        int j = 8;
        if (d>i || e>j || f>i || g>j ) {
            System.out.println ("������ ������� �������!");
        }
        else {
        }
        if (d==f && e==g) {
            System.out.println ("����� �������� �� �����");
        }
        else if (d==f && e!=g) {
            System.out.println ("����� �� ���� ��� ����� ������� � ������ ���� �� ������");
        }
        else if (d!=f && e==g) {
            System.out.println ("����� �� ���� ��� ����� ������� � ������ ���� �� ������");
        }
        else if (d!=f && e==g) {
            System.out.println ("����� �� ���� ��� ����� ������� � ������ ���� �� ������");
        }
        else if (Math.abs(d-f) == Math.abs(e-g)) {
            System.out.println ("����� �� ���� ��� ����� ������� � ������ ���� �� ������");
        }
        else {
            System.out.println ("ERROR");
        }
    } 
}