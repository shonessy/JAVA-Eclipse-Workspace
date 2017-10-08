import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Disk2Screen {
public static final String f1="E:/Java Files/FileWriter.txt";
	
	public static void main(String[] args) {
		BufferedReader br=null;
		FileWriter fw=null;
		PrintWriter pw=new PrintWriter(System.out, true); //moze syso
		
		try{
			System.out.println("Citanje fajla i ispis na konzolu: ");
			br=new BufferedReader(
				new FileReader(f1));
			String s;
			while( (s=br.readLine())!= null)
				pw.println(s);
			System.out.println("Zavrseno");
			
			File newFile=new File("E:/Java Files/NoviFajl.txt");
			newFile.createNewFile();
			fw=new FileWriter(newFile, false);
			fw.write("Zdravo, ovo je upis u novi fajl.");
		}
		catch(IOException e){
			System.out.println("Greska");
		}finally{
			if(br!=null){
				try{
					br.close();
					fw.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajla");
				}
			}
		}//finally
	}//main

}
