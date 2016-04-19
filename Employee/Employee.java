package Employee;

import java.util.Comparator;

public class Employee{
	public static int INN=1;	/// Если это порядковый номер работника, то в конструкторе его надо инкрементировать (нач. значение 0)
	private String Name;
	private String Surname;
	private int Salary;
	
	public Employee (String Name, String Surname, int Salary) {
		this.setName (Name);
		this.setSurname (Surname);
		this.setSalary (Salary);
	}
	public Employee () {
	}
	
	public String getName () {
		return Name;
	}
	public String getSurname () {
		return Surname;
	}
	public int getSalary () {
		return Salary;
	}
	public void setName (String Name) {
		this.Name = Name;
	}
	public void setSurname (String Surname) {
		this.Surname = Surname;
	}
	public void setSalary (int Salary) {
		this.Salary = Salary;
	}
	public String toString(){
		return String.format("%2s %12s %15s %6s", INN++, getName(), getSurname(), getSalary()); 
	}
	
	public static Comparator <Employee> compareByName = new Comparator <Employee> () {
		public int compare(Employee new_employeeOne, Employee new_employeeTwo){
			int compareName = new_employeeOne.getName().compareTo(new_employeeTwo.getName());
			if(compareName != 0)
				return compareName;
			return new_employeeOne.getSurname().compareTo(new_employeeTwo.getSurname());
		}
	};
}
