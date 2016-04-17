/*
 41. ƒано целое число K и массив из дес€ти целых ненулевых чисел. ¬ывести
номер первого числа в массиве, большего K. ≈сли таких чисел нет, то
вывести 0.

42. ƒано целое число K и массив из дес€ти целых ненулевых чисел. ¬ывести
номер последнего числа в массиве, большего K. ≈сли таких чисел нет, то
вывести 0.

43. ƒано вещественное число B, целое число N и массив из N целых чисел,
упор€доченных по возрастанию. ¬ывести элементы массива вместе с числом B,
сохран€€ упор€доченность выводимых чисел.

44. ƒано целое число N и массив из N целых чисел, упор€доченный по
возрастанию. ƒанный набор может содержать одинаковые элементы. ¬ывести в
том же пор€дке все различные элементы данного массива.
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
