/*
Day of the week. 
Write a program that takes a date as input and prints the day of the week that date 
falls on. Your program should take three command-line arguments: m (month), d (day), 
and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 
for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for 
the Gregorian calendar:
y0 = y - (14 - m) / 12
x = y0 + y0/4 - y0/100 + y0/400
m0 = m + 12 * ((14 - m) / 12) - 2
d0 = (d + x + (31*m0)/ 12) mod 7
*/
package PresentationHW;

class Java_W2_04_Basics_Operators_Day_of_the_week {
    public static void main (String [] args) {
    int day = Integer.parseInt (args [0]);
    int month = Integer.parseInt (args [1]);
    int year = Integer.parseInt (args [2]);
    thirdTask (day,month,year);
    }

    public static void thirdTask (int day, int month, int year) {
    	String [] DayOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wensday", "Thursday", "Friday", "Saturday"};
        if (month > 12) {
            System.out.println ("Wrong input!");
        }
        else {
            int year0 = year-(14-month)/12;
            int x = year0+year0/4-year0/100+year0/400;
            int month0 = month+12*((14-month)/12)-2;
            int day0 = (day+x +(31*month0)/12)%7;
            System.out.println (DayOfTheWeek [day0]);            
        }
        }
}