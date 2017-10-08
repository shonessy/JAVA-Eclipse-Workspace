import java.io.*;

public class Test {
	public static final File f1=new File(
			"E:/Java Files/TestFile.txt");
	public static final File f2=new File(
			"E:/Java Files/" + 
			"Inheretance Exercises.txt");
	public static final File f3=new File(
			"E:/Java Files/TestFile2.txt");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Citanje Fajla 1
		 */
		FileInputStream fin=null;
		try{
			System.out.println("Citam fajl: " + 
							f1.getName());
			fin=new FileInputStream(f1);
			int c;
			while( (c=fin.read())!=-1){
				System.out.print((char)c);
			}
		}catch(FileNotFoundException e){
			System.out.println("Nema takvog fajla");
		}catch(IOException e){
			System.out.println("Greska u citanju fajla");
		}finally{
			if(fin!=null)
				try{
					fin.close();
				}catch(IOException e){
					System.out.println("Greska u zavaranju fajla");
				}
			System.out.println("\n\n*****************\n");
		}
		
		/*
		 * Citanje Fajla 2
		 */
		/*fin=null;
		try{
			System.out.println("Citam fajl: " + 
							f2.getName());
			fin=new FileInputStream(f2);
			int c;
			while( (c=fin.read())!=-1){
				System.out.print((char)c);
			}
		}catch(FileNotFoundException e){
			System.out.println("Nema takvog fajla");
		}catch(IOException e){
			System.out.println("Greska u citanju fajla");
		}finally{
			if(fin!=null)
				try{
					fin.close();
				}catch(IOException e){
					System.out.println("Greska u zavaranju fajla");
				}
			System.out.println("\n\n***********\n");
		}*/
		
		/*
		 * Upis u Fajl 1
		 */
		FileOutputStream fout=null;
		String s="Zamenjeni tekst";
		try{
			System.out.println("Upis u fajl 1");
			fout=new FileOutputStream(f1, true);
			for(int i=0; i<s.length(); i++)
				fout.write(s.charAt(i));
		}catch(FileNotFoundException e){
			System.out.println("Fajl nije nadjen");
		}catch(IOException e){
			System.out.println("Greska u upisu");
		}finally{
			if(fout!=null)
				try{
					fout.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajla");
				}
			System.out.println("\n\n*****************\n");
		}
		
		/*
		 * Citanje Fajla 1
		 */
		fin=null;
		try{
			System.out.println("Citam fajl: " + 
							f1.getName());
			fin=new FileInputStream(f1);
			int c;
			while( (c=fin.read())!=-1){
				System.out.print((char)c);
			}
		}catch(FileNotFoundException e){
			System.out.println("Nema takvog fajla");
		}catch(IOException e){
			System.out.println("Greska u citanju fajla");
		}finally{
			if(fin!=null)
				try{
					fin.close();
				}catch(IOException e){
					System.out.println("Greska u zavaranju fajla");
				}
			System.out.println("\n\n*****************\n");
		}
		
		/*Write data
		 * int double booelan
		 */
		DataOutputStream dout=null;	
		int x=7;
		double y=5.65;
		boolean z=true;
		try{
			System.out.println("Unos primitivs u f3");
			dout =new DataOutputStream(
					new FileOutputStream(f3));
			dout.writeInt(x);
			dout.writeDouble(y);
			dout.writeBoolean(z);	
		}catch(FileNotFoundException e){
			System.out.println("Nema takvog fajla");
		}catch(IOException e){
			System.out.println("Greska u upisu");
		}finally{
			if(dout!=null)
				try{
					dout.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajla");
				}
			System.out.println("\n\n*****************\n");
		}
	}//main

}
