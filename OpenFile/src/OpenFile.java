import java.io.*;
public class OpenFile {
	public static void main(String[] args){
		String a;
		try{
			BufferedReader fajl=new BufferedReader(new FileReader("/media/shonesy/Dopunski/Eclipse JAVA WorkSpace/Lista_Radnika.txt"));
			while((a=fajl.readLine())!=null)
				System.out.println(a);
			}
		catch(IOException e){
			System.out.print("Greska: "+e);
			}
		}
}
