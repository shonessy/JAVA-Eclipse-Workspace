import java.util.Random;

public class RandomNumber {
	public static void main(String[] Args){
		
		Random randObj1=new Random();
		//Random randObj2=new Random(10);
		
		for(int i=0;i<2;i++){
			Random randObj2=new Random(10);
			System.out.printf("Poziv: %d\n", i);
			
			System.out.print("Random sa vremenskim sjemenom:   ");
			for(int j=0;j<10;j++)
				System.out.printf("  %d  ", randObj1.nextInt(20));
			
			System.out.print("\nRandom sa prosledjenim sjemenom: ");
			for(int j=0;j<10;j++)
				System.out.printf("  %d  ", randObj2.nextInt(20));
			
			System.out.print("\n-------------------------------\n");
			
		}
		
	}

}
