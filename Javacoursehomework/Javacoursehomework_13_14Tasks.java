/*
13. — начала суток прошло N секунд (N Ч целое). Ќайти количество полных
часов, минут и секунд, прошедших с начала последнего часа.

14. ƒни недели пронумерованы следующим образом: 1 Ч понедельник, 2 Ч
вторник, ..., 6 Ч суббота, 7 Ч воскресенье. ƒано целое число K, лежащее в
диапазоне 1Ц365. ќпределить номер дн€ недели дл€ K≠го дн€ года, если
известно, что в этом году 1 €нвар€ было средой.
*/
package Javacoursehomework;

class Javacoursehomework_13_14Tasks {
    public static void main (String [] args){
        int N = Integer.parseInt (args [0]);
        int K = Integer.parseInt (args [1]);
        task13 (N);
        task14 (K);
    }
    public static void task13 (int N) {
        int min = N/60;
        int hour = N/3600;
        int seclasthour = N%3600;  
        int minlasthour = seclasthour/60;
        System.out.println ("Amount of minutes is: "+min);
        System.out.println ("Amount of hours is: "+hour);
        System.out.println ("Amount of second(last hour) is: "+seclasthour);
        System.out.println ("Amount of minutes(last hour) is: "+minlasthour);
    }
    public static void task14 (int K) {
        while (K>7 && K <= 365) {
            K = K - 7;
        }
        if (K == 1) {
            System.out.println("3. Wensday");
        }
        else if (K == 2) {
            System.out.println("4. Thursday");
        }
        else if (K == 3) {
            System.out.println("5. Friday");
        }
        else if (K == 4) {
            System.out.println("6. Saturday");
        }
        else if (K == 5) {
            System.out.println("7. Sunday");
        }
        else if (K == 6) {
            System.out.println("1. Monday");
        }
        else if (K == 7) {
            System.out.println("2. Tuesday");
        }
        else {
            System.out.println("ƒанные введены неверно!!!");
        }
    }
}