/*

23. ������ ��������� ���� ��������� ���������� ������: 1 � ����, 2 �
�����, 3 � �����, 4 � �����. ����������� ����, ������� �������, ���������
������: 11 � �����, 12 � ����, 13 � ������, 14 � ���. ���� ��� �����
�����: N � ����������� (6 ? N ? 14) � M � ����� ����� (1 ? M ? 4).
������� �������� ��������������� ����� ���� ��������� �����, �����
������, ���� ����� � �. �.

24. ���� ����� ����� � ��������� 100�999. ������� ��������������
������� �����, ��������: 256 � ������� ��������� ������, 814 � ����������
�������������.

25. � ��������� ��������� ������ 60������� ����, ��������� �� 12�������
���������, ������������ ���������� �����: �������, �������, ������, �����
� ������. � ������ �������� ���� ����� �������� ��������: �����, ������,
�����, �����, �������, ����, ������, ����, ��������, ������, ������ �
������. �� ������ ���� ���������� ��� ��������, ���� 1984 ��� � ������
�����: ���� ������� ������.

26. ���� ��� ����� �����: D (����) � M (�����), ������������ ����������
����. ������� ���� �������, ��������������� ���� ����: ��������
(20.1�18.2), ������ (19.2�20.3), ����� (21.3�19.4), ������� (20.4�20.5),
���������� (21.5�21.6), ���� (22.6�22.7), ���� (23.7�22.8), �����
(23.8�22.9), ������ (23.9�22.10), ��������� (23.10�22.11), ���������
(23.11�21.12), �������� (22.12�19.1).

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
             },//������
             {
             "Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius",
             "Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius","Aquarius",
             "Aquarius","Aquarius","Aquarius","Aquarius",
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Piscec","Piscec","Piscec","Piscec"
             },//�������
             {
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Piscec","Piscec","Piscec","Piscec","Piscec","Piscec",
             "Aries","Aries","Aries","Aries","Aries","Aries","Aries",
             "Aries","Aries","Aries","Aries"
             },//����
             {
             "Aries","Aries","Aries","Aries","Aries","Aries","Aries",
             "Aries","Aries","Aries","Aries","Aries","Aries","Aries",
             "Aries","Aries","Aries","Aries","Aries",
             "Taurus","Taurus","Taurus","Taurus","Taurus","Taurus","Taurus",
             "Taurus","Taurus","Taurus","Taurus"
             },//������
             {
             "Taurus","Taurus","Taurus","Taurus","Taurus","Taurus","Taurus",
             "Taurus","Taurus","Taurus","Taurus","Taurus","Taurus","Taurus",
             "Taurus","Taurus","Taurus","Taurus","Taurus",
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Gemini","Gemini","Gemini"
             },//���
             {
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Gemini","Gemini","Gemini","Gemini","Gemini","Gemini",
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Cancer","Cancer","Cancer"
             },//����
             {
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer","Cancer",
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo","Leo","Leo"
             },//����
             {
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo",
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo",
             "Leo","Leo","Leo","Leo","Leo","Leo","Leo","Leo",
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo"
             },//������
             {
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo",
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo",
             "Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo","Virgo",
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra","Libra"
             },//��������
             {
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra",
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra",
             "Libra","Libra","Libra","Libra","Libra","Libra","Libra","Libra",
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             },//�������
             {
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             "Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio","Scorpio",
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Sagittarius","Sagittarius","Sagittarius"
             },//������
             {
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius","Sagittarius",
             "Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn","Capricorn",
             "Capricorn","Capricorn","Capricorn"
             }//�������
             };
    System.out.println (D+"."+M+" "+zodiak[M-1][D-1]);
    }
}