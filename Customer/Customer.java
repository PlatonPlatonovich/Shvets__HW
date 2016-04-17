package Customer;

public class Customer  implements Comparable <Customer>{
	private static int id=1;
	private String Surname;
	private String Name;
	private String Patronymic;
	private String Add;
	private long CreditCardNumber;
	private long BankAccountNumber;
	
	public Customer (){
		}
	
	public Customer (String Surname,String Name,String Patronymic,String Add,long CreditCardNumber,long BankAccountNumber) {
		this.setSurname (Surname);
		this.setName (Name);
		this.setPatronymic (Patronymic);
		this.setAdd (Add);
		this.setCreditCardNumber (CreditCardNumber);
		this.setBankAccountNumber (BankAccountNumber);
	}
	
	public String getSurname () {
		return Surname;
	}
	public void setSurname (String Surname) {
		this.Surname =Surname;
	}
	
	public String getName () {
		return Name;
	}
	public void setName (String Name) {
		this.Name =Name;
	}
	
	public String getPatronymic () {
		return Patronymic;
	}
	public void setPatronymic (String Patronymic) {
		this.Patronymic =Patronymic;
	}
	
	public String getAdd () {
		return Add;
	}
	public void setAdd (String Add) {
		this.Add =Add;
	}
	
	public long getCreditCardNumber () {
		return CreditCardNumber;
	}
	public void setCreditCardNumber (long CreditCardNumber) {
		this.CreditCardNumber =CreditCardNumber;
	}
	
	public long getBankAccountNumber () {
		return BankAccountNumber;
	}
	public void setBankAccountNumber (long BankAccountNumber) {
		this.BankAccountNumber =BankAccountNumber;
	}

	public String toString () {
		return String.format ("\n%s. %s %s %s\n %s\n %s\n %s",id++,getSurname (),getName (),getPatronymic (),getAdd (),getCreditCardNumber (),getBankAccountNumber());
	}
	
	public int compareTo(Customer custList) {
		return this.Surname.compareTo(custList.getSurname());
	}
}
