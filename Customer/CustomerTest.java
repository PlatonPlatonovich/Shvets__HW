package Customer;

import java.util.Arrays;

public class CustomerTest {
	
	public static Customer [] fillCustomer (Customer[] custList) {
		custList [0] = new Customer ("Totti", "Alex", "Petrovich", "Pushkinskaya street 15, apt 16", 82126637, 6536654);
		custList [1] = new Customer ("Shang", "Andrey", "Alexandrovichvich", "Gukovskogo street 44, apt 56", 77320974, 9003700);
		custList [2] = new Customer ("Pui", "Oleg", "Petrovich", "Filatova street 76, apt 345", 72309743, 44782323);
		custList [3] = new Customer ("Rebrov", "Michael", "Olegovich", "Dalnitskaya street 34, apt 256", 69188260, 9972342);
		custList [4] = new Customer ("Shevchenko", "Pavel", "Pavlovich", "Armeyskaya street 8, apt 46", 73676454, 3774774);
		custList [5] = new Customer ("Yarmolenko", "Nikolay", "Igorevich", "Deribasovskaya street 4, apt 4", 32882333, 987873248);
		custList [6] = new Customer ("Avasapov", "Konstantin", "Petrovich", "Pushkinskaya street 234, apt 55", 46750101, 78297464);
		return custList;
	}
	
	public static void printAllCustomers (Customer [] custList) {
		for (Customer e: custList) {
			System.out.println(e.toString());
		}
	}
	
	public static void printByCC (Customer [] custList,long x,long y) {
		System.out.println ("Customers with VIP credit cards: ");
		for (Customer e: custList) {
			if (e.getCreditCardNumber()>=x && e.getCreditCardNumber()<=y) {
				System.out.println(e.getSurname()+" "+e.getName()+" "+e.getCreditCardNumber());
			}
		}
	}
	
	public static void main (String [] args) {
		Customer [] custList = new Customer [7];
		fillCustomer (custList);
		Arrays.sort(custList);
		printAllCustomers (custList);
		System.out.println ("");
		printByCC(custList, 65000000, 75000000);
	}
	
}
