/*

23. ћаст€м игральных карт присвоены пор€дковые номера: 1 Ч пики, 2 Ч
трефы, 3 Ч бубны, 4 Ч червы. ƒостоинству карт, старших дес€тки, присвоены
номера: 11 Ч валет, 12 Ч дама, 13 Ч король, 14 Ч туз. ƒаны два целых
числа: N Ч достоинство (6 ? N ? 14) и M Ч масть карты (1 ? M ? 4).
¬ывести название соответствующей карты вида Ђшестерка бубенї, Ђдама
червейї, Ђтуз трефї и т. п.

24. ƒано целое число в диапазоне 100Ц999. ¬ывести строку≠описание
данного числа, например: 256 Ч Ђдвести п€тьдес€т шестьї, 814 Ч Ђвосемьсот
четырнадцатьї.

25. ¬ восточном календаре прин€т 60≠летний цикл, состо€щий из 12≠летних
подциклов, обозначаемых названи€ми цвета: зеленый, красный, желтый, белый
и черный. ¬ каждом подцикле годы нос€т названи€ животных: крысы, коровы,
тигра, зайца, дракона, змеи, лошади, овцы, обезь€ны, курицы, собаки и
свиньи. ѕо номеру года определить его название, если 1984 год Ч начало
цикла: Ђгод зеленой крысыї.

26. ƒаны два целых числа: D (день) и M (мес€ц), определ€ющие правильную
дату. ¬ывести знак «одиака, соответствующий этой дате: Ђ¬одолейї
(20.1Ц18.2), Ђ–ыбыї (19.2Ц20.3), Ђќвенї (21.3Ц19.4), Ђ“елецї (20.4Ц20.5),
ЂЅлизнецыї (21.5Ц21.6), Ђ–акї (22.6Ц22.7), ЂЋевї (23.7Ц22.8), Ђƒеваї
(23.8Ц22.9), Ђ¬есыї (23.9Ц22.10), Ђ—корпионї (23.10Ц22.11), Ђ—трелецї
(23.11Ц21.12), Ђ озерогї (22.12Ц19.1).

*/
package Javacoursehomework;

class Javacoursehomework_23_26 {

    public static void main (String [] args) {
        int a = Integer.parseInt (args [0]);
        int b = Integer.parseInt (args [1]);
        int c = Integer.parseInt (args [2]);
        int d = Integer.parseInt (args [3]);
        int D = Integer.parseInt (args [4]);
        int M = Integer.parseInt (args [5]);
        task23 (a,b);
        task24 (c);
        task25 (d);
        task26 (D, M);
    }

    public static void task23 (int a, int b) {
    String [][] card = {
        {"Hearts", "Diamonds ", "Clovers", "Pikes"},
        {"6th card", "7th card", "8th card", "9th card", "10th card", "Valet card", "Dame card", "King card", "Ace card"}
    };
    System.out.println(card[0][a-1]+" "+card[1][b-6]);
    }

    public static void task24 (int c) {
    	String [][] number = {
    			{ "One hundred", "Two hundred", "Three hundred", "Four hundred","Five hundred","Six hundred", "Seven hundred", "Eight hundred", "Nine hundred"},
    			{ "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"},
    			{ "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
    			{ "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
    	};
    	if (c%100==0) {
    		System.out.println (number[0][c/100-1]);
    	}
    	else if (c%100<20){
    		System.out.println (number[0][c/100-1]+" and "+number[2][c%10]);
    	}
    	else {
           System.out.println (number[0][c/100-1]+" and "+number[1][c%100/10-2]+" "+number[3][c%10-1]);
    	}
    }

    public static void task25 (int d) {
        String [][] calendar =  {
            {"white", "white", "black", "black", "green", "green", "red", "red", "yellow", "yellow" },
            {"Monkey", "Rooster","Dog", "Boar", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"}
	};
        int animal = d%10;
        int color = d%12;
        System.out.println (d + " is " + calendar[0][animal]+" "+calendar[1][color]);
    }

    public static void task26 (int D, int M) {
        String [][] zodiak =  {
            {"Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn",
             "Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn",
             "Capricorn","Capricorn","Capricorn","Capricorn","Capricorn",
             "Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius",
             "Aquarius","Aquarius","Aquarius","Aquarius"
             },//январь
             {
             "Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius",
             "Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius",
             "Aquarius","Aquarius","Aquarius","Aquarius",
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Piscec","Piscec","Piscec","Piscec"
             },//‘евраль
             {
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Aries","Aries","Aries","Aries","Aries","Aries","Aries",
             "Aries","Aries","Aries","Aries"
             },//ћарт
             {
             "Aries","Aries","Aries","Aries","Aries","Aries","Aries",
             "Aries","Aries","Aries","Aries","Aries","Aries","Aries",
             "Aries","Aries","Aries","Aries","Aries",
             "Taurus","Taurus","Taurus","Taurus","Taurus","Taurus","Taurus",
             "Taurus","Taurus","Taurus","Taurus"
             },//јпрель
             {
             "Taurus","Taurus","Taurus","Taurus","Taurus","Taurus","Taurus",
             "Taurus","Taurus","Taurus","Taurus","Taurus","Taurus","Taurus",
             "Taurus","Taurus","Taurus","Taurus","Taurus",
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Gemini","Gemini","Gemini"
             },//ћай
             {
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Cancer","Cancer","Cancer"
             },//»юнь
             {
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo","Leo","Leo"
             },//»юль
             {
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo",
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo",
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo","Leo",
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo"
             },//јвгуст
             {
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo",
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo",
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo",
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra","Libra"
             },//—ент€брь
             {
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra",
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra",
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra","Libra",
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             },//ќкт€брь
             {
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Sagittarius","Sagittarius","Sagittarius"
             },//Ќо€брь
             {
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn",
             "Capricorn","Capricorn","Capricorn"
             }//ƒекабрь
             };
    System.out.println (D+"."+M+" "+zodiak[M-1][D-1]);
    }
}