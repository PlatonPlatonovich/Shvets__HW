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
import java.util.Arrays;

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
        String [] text = new String[3];
	    switch (c/100) {
                case 1:
                    text[0]="One hundred and ";
                    break;
                case 2:
                    text[0]="Two hundred and ";
                    break;
                case 3:
                    text[0]="Three hundred and ";
                    break;
                case 4:
                    text[0]="Four hundred and ";
                    break;
                case 5:
                    text[0]="Five hundred and ";
                    break;
                case 6:
                    text[0]="Six hundred and ";
                    break;
                case 7:
                    text[0]="Seven hundred and ";
                    break;
                case 8:
                    text[0]="Eight hundred and ";
                    break;
                case 9:
                    text[0]="Nine hundred and ";
                    break;
                }
            switch (c%100/10){
                case 0:
                    text[1]=" ";
                    break;
                case 1:
                    if (c%100!=10) {
                    switch(c%100){
                    case 11:
                        text[1]="Eleven";
                        break;
                    case 12:
                        text[1]="Twelve";
                        break;
                    case 13:
                        text[1]="Thirteen";
                        break;
                    case 14:
                        text[1]="Fourteen";
                        break;
                    case 15:
                        text[1]="Fifteen";
                        break;
                    case 16:
                        text[1]="Sixteen";
                        break;
                    case 17:
                        text[1]="Seventeen";
                        break;
                    case 18:
                        text[1]="Eighteen";
                        break;
                    case 19:
                        text[1]="Nineteen";
                        break;
                }
                }
                else {
                    text [1] = "Ten";
                }
                case 2:
                    text[1]="Twenty";
                    break;
                case 3:
                    text[1]="Thirty";
                    break;
                case 4:
                    text[1]="Fourty";
                    break;
                case 5:
                    text[1]="Fifty";
                    break;
                case 6:
                    text[1]="Sixty";
                    break;
                case 7:
                    text[1]="Seventy";
                    break;
                case 8:
                    text[1]="Eighty";
                    break;
                case 9:
                    text[1]="Ninety";
                    break;
		}
            if(c%10 > 1){
                switch (c%10){
                case 0:
                    text[2]=" ";
                    break;
                case 2:
                    text[2]="Two";
                    break;
                case 3:
                    text[2]="Three";
                    break;
                case 4:
                    text[2]="Four";
                    break;
                case 5:
                    text[2]="Five";
                    break;
                case 6:
                    text[2]="Six";
                    break;
                case 7:
                    text[2]="Seven";
                    break;
                case 8:
                    text[2]="Eight";
                    break;
                case 9:
                    text[2]="Nine";
                    break;
                }		
            }
    System.out.println (Arrays.toString(text));
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