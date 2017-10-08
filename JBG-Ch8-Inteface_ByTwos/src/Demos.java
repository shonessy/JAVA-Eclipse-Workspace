
public class Demos {

	public static void main(String[] args) {
		ByTwos bt2=new ByTwos();
		ByThrees bt3=new ByThrees();
		
		System.out.println("ByTwos: ");
		for(int i=0;i<5;i++)
			System.out.println("Next value is: " + bt2.getNext());
		
		System.out.println("\nResseting ByTwos... ");
		bt2.reset();
		for(int i=0;i<5;i++)
			System.out.println("Next value is: " + bt2.getNext());
		
		System.out.println("\nByTwos start at 500: ");
		bt2.setStart(500);
		for(int i=0;i<5;i++)
			System.out.println("Next value is: " + bt2.getNext());
		
		// ByThrees
		System.out.println("--------------------------------------");
		System.out.println("ByThrees: ");
		for(int i=0;i<5;i++)
			System.out.println("Next value is: " + bt3.getNext());
		
		System.out.println("\nResseting ByThrees... ");
		bt3.reset();
		for(int i=0;i<5;i++)
			System.out.println("Next value is: " + bt3.getNext());
		
		System.out.println("\nByT``hrees start at 500: ");
		bt3.setStart(500);
		for(int i=0;i<5;i++)
			System.out.println("Next value is: " + bt3.getNext());


	}

}
