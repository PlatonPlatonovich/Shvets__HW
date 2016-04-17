package Javacoursehomework;

import java.util.Scanner;

class ChineseCalendar{
	public static String printAnimalandColor(int year){
		String [][] calendar = {
				{"green", "green", "red", "red", "yellow", "yellow", "white", "white", "black", "black"},
				{"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster",
					"Dog", "Boar"}
		};
		int animal = (year-4)%12;
		int color = (year-4)%10;
		return year+" is a "+calendar[0][color]+" "+calendar[1][animal]+" year";
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		System.out.println(printAnimalandColor(year));
	}
}