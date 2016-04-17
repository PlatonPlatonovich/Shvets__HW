package Employee;

import java.util.Arrays;

public class Reports  implements Payable{

	
	public static Employee [] fillemployee (Employee [] new_employee) {
		new_employee[0] = new Manager("Gleb","Svyazhin", 5500, 600);
		new_employee[1] = new Employee("Oleg","Streltsov",5680);
		new_employee[2] = new Employee("Mykola","Pashkovskyi",5899);
		new_employee[3] = new Employee("Kareem","Khalil",5234);
		new_employee[4] = new Employee("Ronald","Monks",5356);
		new_employee[5] = new Manager("Victor","Sotov",5754, 1000);
		new_employee[6] = new Employee("Olga","Dovganich",5566);
		new_employee[7] = new Employee("Anton","Hrytsenko",5455);
		new_employee[8] = new Employee("Anton","Havriliuk",5545);
		new_employee[9] = new Manager("Andrey","Sylchuk",5445, 2800);
		return new_employee;
	}
	public static void printReport (Employee [] new_employee) {
		System.out.printf("\n%2s %12s %15s %6s %6s\n", "INN","Name","Surname","Salary", "Bonus");
		for(Employee e: new_employee){
			System.out.println(e.toString());
		}
	}

	public String SumSalary (Employee [] new_employee) {
		int Total_Salary  =0;
		for (Employee e: new_employee) {
			Total_Salary += e.getSalary();
		}
	return String.format("\n Total budget of the company is:\t%s\n", Total_Salary);
	}
	
	public static void Min_salary (Employee [] new_employee) {
		Employee poorestEmployee = new Employee ();
		int Min_Salary  =Integer.MAX_VALUE;
		for (Employee e: new_employee) {
			if(Min_Salary>e.getSalary()) {
			Min_Salary = e.getSalary();
			poorestEmployee = e;
			}
		}
		System.out.printf ("\n The poorest employee is: %s\n", poorestEmployee);
	}
	
	public static void Max_salary (Employee [] new_employee) {
		Employee reachestEmployee = new Employee ();
		int Max_Salary  = Integer.MIN_VALUE;
		for (Employee e: new_employee) {
			if(Max_Salary<e.getSalary()){
				Max_Salary = e.getSalary();
				reachestEmployee = e;
			}
		}
		System.out.printf ("\n The reachest employee is: %s\n",reachestEmployee);
	}
	
	public static void main (String [] args) {
		Employee [] new_employee = new Employee [10];
		Reports rep = new Reports();
		fillemployee (new_employee);
		printReport (new_employee);
		System.out.println(rep.SumSalary(new_employee));
		Min_salary (new_employee);
		Max_salary (new_employee);
		Arrays.sort(new_employee, Employee.compareByName);
	}
}
