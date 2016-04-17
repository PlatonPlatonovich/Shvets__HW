/*
1) Write a code fragment that reverses the order of a
one-dimensional array a[] of int values. Do not 
create another array to hold the result.

2) Write a code fragment that shuffle one-dimensional 
array a[] of different int values.
*/

package PresentationHW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class Java_W3_06_Arrays {
	
	
    public static void main (String[] args) {
    	Scanner sc = new Scanner (System.in);
    	int length = sc.nextInt ();
    	int [] a = new int [length];
    	for (int i=0; i<a.length;i++) {
    		a[i] = (int)(Math.random ()*10);
    	}
		System.out.println (Arrays.toString(a));
    	reverse_the_order (a);
    	shuffle_the_order (a);
    	sc.close();
    }

    public static void reverse_the_order (int [] a) {
    	for (int i=0; i<a.length/2;i++) {
    		int temp = a[i];
    		a[i] = a[a.length-i-1];
    		a[a.length-i-1] = temp; 
    	}
    	System.out.println ();
		System.out.println (Arrays.toString(a));
    }
    public static void shuffle_the_order (int [] a) {
    	Random rnd = new Random ();
    	for (int i=0; i<a.length;i++) {
    		int randomIndex = rnd.nextInt(a.length);
    		int temp = a[i];
    		a[i] = a[randomIndex];
    		a[randomIndex] = temp; 
    	}
    	System.out.println ();
		System.out.println (Arrays.toString(a));
    }
}