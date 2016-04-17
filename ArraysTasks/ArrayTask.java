/*
 «адачи на массивы

ƒан массив из 10-ти случайных целых чисел
1 ѕомен€ть местами максимальный и минимальный элемент массива

2 Ќайти элемент массива, значение которого находитс€ ближе всего к 
среднему значению максимального и минимального элементов массива.

3. »зменить пор€док следовани€ элементов массива на противоположный

4. —двинуть массив вправо (влево) так, чтобы минимальный (максимальный)
элемент массива оказалс€ первым(последним).

5. ѕеретасовать массив.
 */
package ArraysTasks;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class ArrayTask {
	
	public static void main (String[]args) {
		int [] a = new int [10];
    	for (int i=0; i<a.length;i++) {
    		a[i] = (int)(Math.random ()*10);
    	}
		int min = a[0];
		int max = a[0];
		int min_index = 0;
		int max_index = 0;	
    	System.out.println(Arrays.toString(a));
    	minmaxchange (a, max,min,max_index,min_index);
    	average (a, max,min,max_index,min_index);
    	reverse (a);
    	first_last (a);
    	shuffle (a);
	}
	
	public static void minmaxchange (int [] a, int max, int min, int max_index, int min_index) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				max_index = i;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				min_index = i;
			}
		}
		int temp = a[min_index];
		a[min_index] = a[max_index];
		a[max_index] = temp;
    	System.out.println(Arrays.toString(a));
	}
	
	public static void average (int [] a, int max, int min, int max_index, int min_index) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				max_index = i;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				min_index = i;
			}
		}
		int ave = (max+min)/2;
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			if (Math.abs(ave - a[i])<Math.abs(ave-temp)) {
				temp=a[i];
			}
		}
		System.out.println (temp);
	}
	public static void reverse (int [] a) {
		for (int i=0; i<a.length/2;i++) {
    		int temp = a[i];
    		a[i] = a[a.length-i-1];
    		a[a.length-i-1] = temp; 
    	}
    	System.out.println ();
		System.out.println (Arrays.toString(a));
	}

	public static void first_last (int [] a) {
		int temp = a[a.length-1];
		for(int i=a.length-1; i>0; i--){
			a[i]=a[i-1];
		}
		a[0]=temp;
    	System.out.println ();
		System.out.println (Arrays.toString(a));
	}
	public static void shuffle (int [] a) {
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
