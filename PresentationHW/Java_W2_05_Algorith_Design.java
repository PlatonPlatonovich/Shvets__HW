/*
1) Modify the example from the lesson so that user can input any amount
of years for investment calculation. The program should also display 
interest value of each year.

2) Write a program that draws a checkerboard in a console output. Usually the
checkerboard contains 8 rows of squares and 8 columns, but for this task the board 
can have any number of rows and columns that are specified by user. The squares 
are black and white. The white squares should be marked as space (‘O‘), and the 
black squares should be marked as ‘#’.
Here is a tricky way to determine whether a given square should be red or 
black: If the row number and the column number are either both even or both odd, 
then the square is white. Otherwise, it is black. 
Example of board with size 4x4:
O#O#
#O#O
O#O#
#O#O

3) Given a positive integer, N, define the ’3N+1’ sequence starting from N
as follows: If N is an even number, then divide N by two; but if N is odd,
then multiply N by 3 and add 1. Continue to generate numbers in this way
until N becomes equal to 1. For example, starting from N = 3, which is odd,
we multiply by 3 and add 1, giving N = 3*3+1 = 10. Then, since N is even,
we divide by 2, giving N = 10/2 = 5. We continue in this way, stopping when
we reach 1, giving the complete sequence: 3, 10, 5, 16, 8, 4, 2, 1.
Write a program that will read a positive integer from the user
and will print out the 3N+1 sequence starting from that integer. The
program should also count and print out the number of terms in the
sequence.

4) If N and D are positive integers, we say that D is a divisor of N if the remainder
when D is divided into N is zero.
    1. Write a program that inputs a positive integer, N, from the user and computes
how many different divisors N has.
    2. Which integer between 1 and 10000 has the largest number of divisors, and how
many (solution) divisors does it have? Write a program to find the answers and
print out the results. It is possible that several integers in this range have the
same, maximum number of divisors. Your program only has to print out one of
them.
*/
package PresentationHW;

class Java_W2_05_Algorith_Design {
    public static void main (String [] args) {
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]); 
        int yearnumber = Integer.parseInt (args[2]);
        double interest = 0.0;
        int rows = Integer.parseInt (args[3]);
        int columns = Integer.parseInt (args[4]);
        int N = Integer.parseInt (args[5]);
        int M = Integer.parseInt (args[6]);
        firstTask (principal, rate, yearnumber, interest);
        secondTask ();
        secondTaskNew (rows, columns);
        thirdTask (N);
        fourthTask (M);
        fourthTaskPart2 ();
    }
    public static void firstTask (double principal, double rate, int yearnumber, double interest) {
        int y = 0;
        while (y < yearnumber) {
                y = y + 1;
                interest = principal * rate;
                principal = principal + interest;
                System.out.println(principal);
        }
    }
    public static void secondTask () {
        char i = '0';
        char j = '#';
            for (int n = 1; n<=64; n++) {
                if (n%2==0 && n%8==0) {
                    System.out.println (j); // this condition is used in order to move to the next line
                }
                else if (n%2!=0 && n%8==0) { // this condition is used in order to move to the next line
                    System.out.println (i);
                }
                 else if (n%2==0 && n%8!=0) {
                    System.out.print ( j);
                }
                 else {
                    System.out.print (i);
                } 
            }
    }
    public static void secondTaskNew (int rows, int columns) {
        for (int n = 1; n<=columns; n++) {
            System.out.println("");
            for (int m = 1; m<=rows; m++) {
                if ((n+m)%2 == 0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("#");
                }
            }
        }
    System.out.println ("");
    }
    public static void thirdTask (int N) {
        while (N != 1) {
            System.out.print (N + " ");
            if (N%2==0) {
                N=N/2;
            }
            else {
                N=N*3+1;
            }
       }
        System.out.println ("");
    }
    public static void fourthTask (int M) {
        int counter = 0;
        for (int D=1; D<=M; D++) {
            if (M%D==0) {
                counter = counter + 1;
            }
            else {
            }
        }
        System.out.println ("N has "+counter+" different divisors");
    }
    public static void fourthTaskPart2 () {
        int counter;
        int comparing = 0;
        int result = 0;
        for (int M=1; M<=10000; M++) {
            counter = 0; 
            for (int D=1; D<=M;D++ ) {
                if (M%D==0) {
                    counter = counter + 1;
                }
                else {
                }
                if (comparing < counter) {
                    comparing = counter;
                    result = M;
                }
                else {
                }
            }
        }
        System.out.println (result + " has the largest number of divisors= " + comparing);
    } 
}