import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Key2Disk {
	public static final File f1=new File(
			"E:/Java Files/FileWriter.txt");
	
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		FileWriter fw=null;
		
		try{
			System.out.println("Unesite tekst, stop prekida: ");
			fw=new FileWriter(f1, true);
			String s;
			while(! (s=br.readLine()).equals("stop") )
				fw.write(s + " ");
			fw.append('\n');
			System.out.println("Unos zavrsen");
		}catch(IOException e){
			System.out.println("Greska: " + e);
		}finally{
			if(fw!=null){
				try{
					fw.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajla");
				}
			}
		}

	}

}
