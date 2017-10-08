import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
	public static final String f1="E:/Java Files/Fajl1.txt";
	public static final String f2="E:/Java Files/Fajl2.txt";
	public static final String f3="E:/Java Files/Fajl3.txt";

	public static void main(String[] args) {
		
		System.out.println(TestingFiles.compare(f2, f1));
		
		/*FileInputStream fin1=null,
						fin2=null,
						fin3=null;
		try{
			System.out.println("Uporedjivanje fajlova");
			fin1=new FileInputStream(f1);
			fin2=new FileInputStream(f2);
			fin3=new FileInputStream(f3);
			
			//comparing f1 i f2
			int x,y;
			boolean areSame=true;
			while( (x=fin1.read())!=-1 && 
				   (y=fin2.read())!=-1 ){
				if(x!=y){
					areSame=false;
					break;
				}
			}
			System.out.println("Fajlovi f1 i f2 su: " +
					(areSame ? "Isti" : "Razliciti") );
			System.out.println("\n************\n");
			try{
				fin1.close();
				fin2.close();
				fin3.close();
			}catch(IOException e){
				System.out.println("Greska u zatvaranju fajlova");
			}

			//comparing f1 i f3
			fin1=new FileInputStream(f1);
			fin2=new FileInputStream(f2);
			fin3=new FileInputStream(f3);
			
			areSame=true;
			while( (x=fin1.read())!=-1 && 
				   (y=fin3.read())!=-1 ){
				if(x!=y){
					areSame=false;
					break;
				}
			}
			System.out.println("Fajlovi f1 i f3 su: " +
					(areSame ? "Isti" : "Razliciti") );
			System.out.println("\n************\n");
			try{
				fin1.close();
				fin2.close();
				fin3.close();
			}catch(IOException e){
				System.out.println("Greska u zatvaranju fajlova");
			}
			
			//comparing f2 i f3
			fin1=new FileInputStream(f1);
			fin2=new FileInputStream(f2);
			fin3=new FileInputStream(f3);
			
			areSame=true;
			while( (x=fin2.read())!=-1 && 
				   (y=fin3.read())!=-1 ){
				if(x!=y){
					areSame=false;
					break;
				}
			}
			System.out.println("Fajlovi f2 i f3 su: " +
					(areSame ? "Isti" : "Razliciti") );
			System.out.println("\n************\n");
			try{
				fin1.close();
				fin2.close();
				fin3.close();
			}catch(IOException e){
				System.out.println("Greska u zatvaranju fajlova");
			}
			
		}catch(FileNotFoundException e){
			System.out.println("Fajl nije pronadjen");
		}catch(IOException e){
			System.out.println("Gereska u citanju fajla");
		}finally{
			if(fin1!=null && fin2!=null){
				try{
					fin1.close();
					fin2.close();
					fin3.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajlova");
				}
			}
		}*/
		
		
		
	}

}
