
public class Account {
	private int accountNumber;
	private double balance=0.0;
	
	//Constructors
	public Account(int accountNumber, double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public Account(int accountNumber){
		this.accountNumber=accountNumber;
	}
	
	//Getters & Setters
	public int getAccountNumber(){
		return accountNumber;
	}
	public double  getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	//Methods
	public void credit(double amount){
		balance+=amount;
	}
	public void debit(double amount){
		if(balance>=amount)
			balance-=amount;
		else
			System.out.println("ERROR : Nemate dovoljno novca na racunu za ovu transakciju");
	}
	public String toString(){
		return "A/C no: " + accountNumber + 
			   ", Balance= " + balance + "$";
	}
	
	
	
	
}
