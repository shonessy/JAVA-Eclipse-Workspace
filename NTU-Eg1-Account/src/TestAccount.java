
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1, a2;
		a1=new Account(1234, 99.99);
		a2=new Account(8808);
		
		//Testing toString
		System.out.println(a1.toString());
		System.out.println(a2);				//toString
		
		//Testing Setters & Getters;
		a1.setBalance(a1.getBalance()+25);
		a2.setBalance(87.54);
		System.out.printf("Stanje na racunu no: %d je %f\n",
							a1.getAccountNumber(), a1.getBalance());
		System.out.printf("Stanje na racunu no: %d je %f\n",
				a2.getAccountNumber(), a2.getBalance());
		
		//Testing credit & debit
		a1.credit(27.01);
		a2.debit(54.75);
		System.out.println(a1.toString());
		System.out.println(a2);	
		a2.debit(154.78);
		

	}
		
		
}
