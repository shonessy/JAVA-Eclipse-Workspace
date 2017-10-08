import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelpFile {
	private static final String path="E:/Java Files/";
	private	String fileName;
	
	//Constructor
	public HelpFile(String fileName){
		this.fileName=path + fileName;
	}
	
	//getSelection
	public String getSelection(){
		String topic="";
		System.out.print("\nTema: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			topic+=br.readLine();
		}catch(IOException e){
			System.out.println("Greska u citanju sa konzole");
		}
		return topic;
	}
	
	//helpOn
	public boolean helpOn(String what){
		BufferedReader br=null;
		String currLine, explanation;
		try{
			br=new BufferedReader(new FileReader(fileName));
				while((currLine=br.readLine())!=null){
				if(!currLine.equals("") && currLine.charAt(0)=='#'){
					if(currLine.substring(1).equals(what)){
						while((explanation=br.readLine())!=null && !explanation.equals("") 
								&& explanation.charAt(0)!='#')
							System.out.println(explanation);
						return true;
					}//if what
				}//if #
			}
			
		}catch(IOException e){
			System.out.println("Greska");
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajla");
				}
			}
		}
		return false;
	}//helpOn
	
}
