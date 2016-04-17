package notepad;

import java.util.Date;
import java.util.Scanner;

public class Notepad {
	private static int size = 0;
	private String [] notepad = new String [20];
	
	public Notepad () {
		Record [] notepad = new Record [10];
	}
		
	class Record {
		private String record;
		private Date date;
		
		public Record (String rec, Date datte) {
			record = rec;
			date = datte;
		}
		
		public String getRecord () {
			return record;
		}
		public Date getDate () {
			return date; 
		}
		public void setRecord (String record) {
			this.record=record;
		}
		public void setDate (Date date) {
			this.date=date;
		}
		public String toString () {
			return (getRecord ()+"\t"+getDate());
		}
		
		
	}
	
	public static void main (String[]args) {
		Record [] notepad = new Record [10];
			for (int x=0; x < notepad.length; x++) {
			size++;
			Scanner sc = new Scanner (System.in);
			String record= sc.nextLine ();
			Date date= sc.nextLine ();
			notepad [x] = new Record (record, date);
			System.out.printf ("%d\t%d\n", size, notepad[x]);
		}
	}
}