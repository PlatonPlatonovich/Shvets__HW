/*
1) Write a program that uses Math.sin() and Math.cos() to check that the value of
sin2? + cos2? is approximately 1 for any ? entered as a command-line argument. 
Just print the value. Why are the values not always exactly 1?

2) Write a program that takes two positive integers as command-line arguments and 
prints true if either evenly divides the other.

3) Write a program that takes three positive integers as command-line arguments 
and prints true if any one of them is strictly greater than the sum of the other 
two and false otherwise.

4) Write a program that takes two int values a and b from the command line and 
prints a random integer between a and b.

5) Write a program that prints the sum of two random integers between 1 and 6 
(such as you might get when rolling dice).

*/
import java.lang.Math;
import java.util.Random;


class Java_W2_04_Basics_Operators_Part2 {
    public static void main (String [] args) {
    double a = Double.parseDouble (args[0]);
    int b = Integer.parseInt (args[1]);
    int c = Integer.parseInt (args[2]);
    int d = Integer.parseInt (args[3]);
    int e = Integer.parseInt (args[4]);
    int f = Integer.parseInt (args[5]);
    firstTask (a);
    secondTask (b,c);
    thirdTask (b,c,d);
    fourthTask (e, f);
    fifthTask ();
    }
    public static void firstTask (double a) {
        if ( Math.pow(Math.sin(a),2) + Math.pow(Math.cos(a),2) == 1) {
            System.out.println ("Value is 1");
        }
        else {
            System.out.println ("MAGIC!!! It is not 1");
        }
    }
    public static void secondTask (int b, int c) {
        if (Math.abs(b)%Math.abs(c) == 0) {		/// Надо еще проверить деление c на b
            System.out.println ("True!!!");
        }
        else {
            System.out.println ("False!!!");
        }
    }
    public static void thirdTask (int b, int c, int d) {
        if ((b+c)<d || (b+d)<c || (d+c)<b) {
            System.out.println ("True!!!");
        }
        else {
            System.out.println ("False!!!");
        }
    }
    public static void fourthTask (int e, int f) {
            int min;
            int max;
        if (e<f) { 
            min = e;
            max = f;
        }
        else {
            min = f;
            max = e;
        }
        int rnumber = min + (int)(Math.random()*((max - min) + 1));
        System.out.println ( "Random number is " + rnumber );    
    }
    public static void fifthTask () {
        int rnumber1 = 1 + (int)(Math.random()*6);
        int rnumber2 = 1 + (int)(Math.random()*6);
        int summ = rnumber1 + rnumber2;
        System.out.println ("Summ of 2 random numbers is " + summ );
    }
}