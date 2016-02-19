public class Javacoursehomework_1_4Tasks{

    public static void main (String [] args) {
        int a = Integer.parseInt (args [0]);
        int b = Integer.parseInt (args [1]);
        int c = Integer.parseInt (args [2]);
    }

    public static void firsttask (int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println ("Переменная a = " + a);
        System.out.println ("Переменная b = " + b);                
    }

    public static void secondtask (int a, int b, int c) {
        int d = a;
        a = b;
        b = c;
        c = d;
        System.out.println ("Переменная a = " + a);
        System.out.println ("Переменная b = " + b);  
        System.out.println ("Переменная c = " + c);                          
    }

    public static void thirdtask (int a, int b, int c) {
        int d = a;
        a = c;
        c = b;
        b = d;
        System.out.println ("Переменная a = " + a);
        System.out.println ("Переменная b = " + b);  
        System.out.println ("Переменная c = " + c);                 
    }

    public static void fourthtask (int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println ("Переменная a = " + a);
        System.out.println ("Переменная b = " + b);                   
    }
}