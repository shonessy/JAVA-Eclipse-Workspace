
public class Account {
	int ID;
	Customer customer;
	double balance;
	
	//Constructor
	public Account(int ID, Customer customer, double balance){
		this.ID=ID;
		this.customer=customer;
		this.balance=balance;
	}
	public Account(int ID, Customer customer){
		this.ID=ID;
		this.customer=customer;
		balance=0.0;
	}
	
	//Setters & Getters
	public int getID(){
		return ID;
	}
	public Customer getCustomer(){
		return customer;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public String getCustomerName(){
		return customer.getName();
	}
	
	//toString
	public String toString(){
		return String.format(customer + "\tbalance=%.2f", balance);
	}
	
	//operacije sa novcem
	public Account deposit(double amount){
		balance+=amount;
		return this;
	}
	public Account withdraw(double amount){
		if(balance>=amount)
			balance-=amount;
		else
			System.out.println("Nemate dovoljno novca "
							 + "na racunu za ovu trensakciju");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
}
