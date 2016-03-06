/*
1) Write a code fragment that reverses the order of a
one-dimensional array a[] of int values. Do not 
create another array to hold the result.

2) Write a code fragment that shuffle one-dimensional 
array a[] of different int values.
*/

import java.lang.Math;
import java.util.Random;

class Java_W3_06_Arrays {

    public static void main(String[] args) {
    }

    public static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
	}
        int[] mSolutionArray = { 1,2,3,4 };
        shuffleArray(mSolutionArray);
        
        Log.i("Array", Arrays.toString(mSolutionArray));
    }  
}