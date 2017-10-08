
public class TestAccount {

	public static void main(String[] args) {
		Customer c1=new Customer(5412, "Marko", 'm');
		Account a1=new Account(2005, c1, 54.25);
		System.out.println(a1);
		
		System.out.println(a1.deposit(45.75));
		System.out.println(a1.withdraw(78.50));
		System.out.println(a1.withdraw(45.23));
	}

}
