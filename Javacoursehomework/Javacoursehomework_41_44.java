/*
 41. ���� ����� ����� K � ������ �� ������ ����� ��������� �����. �������
����� ������� ����� � �������, �������� K. ���� ����� ����� ���, ��
������� 0.

42. ���� ����� ����� K � ������ �� ������ ����� ��������� �����. �������
����� ���������� ����� � �������, �������� K. ���� ����� ����� ���, ��
������� 0.

43. ���� ������������ ����� B, ����� ����� N � ������ �� N ����� �����,
������������� �� �����������. ������� �������� ������� ������ � ������ B,
�������� ��������������� ��������� �����.

44. ���� ����� ����� N � ������ �� N ����� �����, ������������� ��
�����������. ������ ����� ����� ��������� ���������� ��������. ������� �
��� �� ������� ��� ��������� �������� ������� �������.
 */
package Javacoursehomework;

import java.util.Scanner;

public class Javacoursehomework_41_44 {
	
	public static void mail (String [] args) {
		Scanner sc = new Scanner (System.in);
		int K = sc.nextInt ();
		double B = sc.nextDouble ();
		int N = sc.nextInt ();
		sc.close();
		task41 (K);
		task42 (K);
		task43 (B, N);
	}
	public static void task41 (int K) {
        int [] ar = new int [10];
        for (int i=0; i<=ar.length; i++) {
        	ar[i] = ((int)(Math.random()+1)*10);
        	if (ar[i]>K) {
        		System.out.println(i +" bigger than K");
        		break;
        	}
        	else 
        		System.out.println("0");
        }     	
	}
    public static void task42 (int K) {
    	int a = 0;
        int [] ar = new int [10];
        for (int i=0; i<=ar.length; i++) {
        	ar[i] = ((int)(Math.random()+1)*10);
        	if (ar[i]>K) {
        		a = i;
        	}
        	else {
        	}
        }
        if (a!=0) {
        	System.out.println (a+" is the last one biggest number");
        }
        else {
    		System.out.println("0");
        }
    }
	public static void task43 (double B, int N) {
        int [] ar = new int [N];
        for (int i=0; i<=ar.length; i++) {
        	ar[i] = ((int)(Math.random()+1)*10);
        }
        
    }  
}
