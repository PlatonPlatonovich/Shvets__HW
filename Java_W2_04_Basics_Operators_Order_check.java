/*

Order check. 
Write a program that takes three double values x, y, and z as command-line arguments 
and prints true if the values are strictly ascending or descending (x < y < z or x > y > z), 
and false otherwise.

*/
import java.lang.Math;

class Java_W2_04_Basics_Operators_Order_check {
    public static void main (String [] args) {
    double x = Double.parseDouble (args [0]);
    double y = Double.parseDouble (args [1]);
    double z = Double.parseDouble (args [2]);
    secondTask (x,y,z);
    }

    public static void secondTask (double x, double y, double z) {
        x = Math.abs(x);
        y = Math.abs(y);
        z = Math.abs(z);
        if (x<y && y<z) {
            System.out.println ("True");
        }
        else if (x>y && y>z) {
            System.out.println ("True");
        }
        else {
            System.out.println ("False");
        }
    }
}  