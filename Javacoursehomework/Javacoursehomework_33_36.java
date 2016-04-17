package Javacoursehomework;
/*

33. Начальный вклад в банке равен 1000 руб. Через каждый месяц размер
вклада увеличивается на P процентов от имеющейся суммы (P — вещественное
число, 0 < P < 25). По данному P определить, через сколько месяцев размер
вклада превысит 1100 руб., и вывести найденное количество месяцев K
(целое число) и итоговый размер вклада S (вещественное число).

34. Дано целое число N (> 0). Используя операции деления нацело и взятия
остатка от деления, вывести все его цифры, начиная с самой правой
(разряда единиц).

35. Дано целое число N (> 1). Если оно является простым, то есть не
имеет положительных делителей, кроме 1 и самого себя, то вывести True,
иначе вывести False.

36. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK
определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, ...
. Проверить, является ли число N числом Фибоначчи. Если является, то
вывести True, если нет — вывести False.
*/

public class Javacoursehomework_33_36 {

    public static void main (String [] args) {
        float P = Float.parseFloat (args [0]);
        int N = Integer.parseInt (args [1]);
        task33(P);
        task34(N);
        task35(N);
        task36(N);
    }

    public static void task33 ( double P) {
        int b = 1000;
        double S =(double)b;
        int K = 0;
        do {
            S=S+1000*(P/100);
            K=K+1;
        }
        while (S<1100);
        System.out.println("Размер вклада превысит 1100 руб. через "+K+" месяцев и составит"+S);
    }
    public static void task34 (int N) {
        int i =10;
        int j =1;
        do {
            int num =N%i/j;
            i=i*10;
            j=j*10;
            System.out.println (num);
        }
        while (N>(i/10));
    }
    public static void task35 (int N) {
        boolean m;
        int b = 0;
        for (int i=1; i<=N; i++) {
            if (((double)N/(double)i)%1==0) {
                b = b+1;
            }
            else {
            }
        }
        m = b==2;
        System.out.println (m);
    }
    public static void task36 (int N) {
    	boolean a = true;
        int [] fibon = new int [N];
        fibon[0] = 1;
        fibon[1] = 1;
        for(int i = 2; i<N; i++) {
            fibon[i] = fibon[i-2]+fibon[i-1];
            if(fibon[i] == N) {
                System.out.println (a);
                break ;
            }
            else {
            }
            System.out.println (!a);
        }
    }        
}