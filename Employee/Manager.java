package Employee;

public class Manager extends Employee{
	private int bonus;
	
	public Manager () {
	}
	public Manager (String Name, String Surname,int Salary,int bonus) {
		super(Name, Surname, Salary);
		setBonus(bonus);
	}
	public void setBonus (int bonus) {
		this.bonus = bonus;
	}
	public int getBonus () {
		return bonus;
	}
	public int getSalary() {
		return super.getSalary()+getBonus();
	}
	public String toString () {
		return String.format("%2s %12s %15s %6s %6s", INN++, super.getName(), super.getSurname(), getSalary(), getBonus ());
	}
}
