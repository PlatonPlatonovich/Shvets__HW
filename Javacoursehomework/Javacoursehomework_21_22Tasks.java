/*
21. ƒан номер года (положительное целое число). ќпределить количество
дней в этом году, учитыва€, что обычный год насчитывает 365 дней, а ви≠
сокосный Ч 366 дней. ¬исокосным считаетс€ год, дел€щийс€ на 4, за
исключением тех годов, которые дел€тс€ на 100 и не дел€тс€ на 400
(например, годы 300, 1300 и 1900 не €вл€ютс€ високосными, а 1200 и 2000 Ч
€вл€ютс€).

22. ƒан номер мес€ца Ч целое число в диапазоне 1Ц12 (1 Ч €нварь, 2 Ч
февраль и т. д.). ¬ывести название соответствующего времени года и
мес€ца, например, Умарт ≠ веснаФ, Уавгуст ≠ летоФ и т.п.
*/
package Javacoursehomework;

class Javacoursehomework_21_22Tasks {

    public static void main (String [] args) {
    int a =Integer.parseInt (args [0]);
    int b =Integer.parseInt (args [1]);
    task21 (a);
    task22 (b);
    }

    public static void task21 (int a) {
        if (a%100==0 && a%400==0) {
            System.out.println ("366 days");
        }
        else if (a<400 && a%4==0) {
            System.out.println ("366 days");
        }
        else {
            System.out.println ("365 days");
        }
    }

    public static void task22 (int b) {
        switch (b) {
            case 1:
                System.out.println ("январь - зима");
                break;
            case 2:
                System.out.println ("‘евраль - зима");
                break;
            case 3:
                System.out.println ("ћарт - весна");
                break;
            case 4:
                System.out.println ("јпрель - весна");
                break;
            case 5:
                System.out.println ("ћай - весна");
                break;
            case 6:
                System.out.println ("»юнь - лето");
                break;
            case 7:
                System.out.println ("»юль - лето");
                break;
            case 8:
                System.out.println ("јвгуст - лето");
                break;
            case 9:
                System.out.println ("—ент€брь - осень");
                break;
            case 10:
                System.out.println ("ќкт€брь - осень");
                break;
            case 11:
                System.out.println ("Ќо€брь - осень");
                break;
            case 12:
                System.out.println ("ƒекабрь - зима");
                break;
            default:
                System.out.println ("Man, you entered a wrong data");
            }
        
    }
}