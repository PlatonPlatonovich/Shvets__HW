/*
Loan payments.
Write a program that calculates the monthly payments you would have to make over a 
given number of years to pay off a loan at a given interest rate compounded 
continuously, taking the number of years t, the principal P, and the annual interest rate 
r as command-line arguments. The desired value is given by the formula P*e(rt)
Math.exp().
*/
package PresentationHW;

import java.lang.Math;

class Java_W2_04_Basics_Operators_Loan_payments {
    public static void main (String [] args) {
    int t = Integer.parseInt (args [0]);
    int P = Integer.parseInt (args [1]);
    double r = Double.parseDouble (args [2]); 
    firstTask (t, P, r);
    }

    public static void firstTask (int t, int P, double r) {
        double value = (double)P*Math.exp(r*(double)t);
        System.out.printf ("If principal is %d, annual interest rate %f, loan was taken on %d years, monthly payments would be %.2f", P, r, t, value);
    }
  
}