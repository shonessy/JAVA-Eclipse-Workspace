import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int n=input.nextInt();
		input.close();
		int numSteps=0;
		while(n!=1){
			if(n%2==0)
				n/=2;
			else
				n=n*3+1;
			numSteps++;
		}
		System.out.println("Koraka potrebno za stizanje do 1: "
						    + numSteps);
	}

}
