/*
1) Write a for loop that will print out all the multiples of 3 from 3 to 36, that is: 3 6 9
12 15 18 21 24 27 30 33 36.
2) Fill in the following main() routine so that it will ask the user to enter an integer, 
read the user’s response, and tell the user whether the number entered is even or 
odd. (Recall that an integer n is even if n % 2 == 0.)
*/
package PresentationHW;

import java.util.Scanner;

class Java_W2_04_Basics_Operators_Part1 {
    public static void main (String [] args) {
    firstTask ();
    secondTask ();
    }
    public static void firstTask () {
        int i = 3;
        while (i >= 3 && i<=36) {
            System.out.println (i);
            i = i +3;
        }
    }
    public static void secondTask () {
        System.out.println ("Введите любое целое число!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if ( n%2==0 ) {
            System.out.println ("Вы ввели четное число");
        }
        else {
            System.out.println ("Вы ввели нечетное число");
        }
    }
}