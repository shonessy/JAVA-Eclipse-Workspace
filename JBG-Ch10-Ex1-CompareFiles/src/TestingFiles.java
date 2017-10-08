import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestingFiles {
	private static String file1,
				   file2;
	private static FileInputStream fin1=null,
								   fin2=null;
	//Constructor
	public TestingFiles(String file1, String file2){
		this.file1=file1;
		this.file2=file2;
	}
	
	//Compare files
	public static boolean compare(String file1, String file2){
		try{
			fin1=new FileInputStream(file1);
			fin2=new FileInputStream(file2);
			int x,y;
			boolean areSame=true;
			while( (x=fin1.read())!=-1 && 
				   (y=fin2.read())!=-1 ){
				if(x!=y){
					areSame=false;
					break;
				}
			}
			return areSame;
		}catch(FileNotFoundException e){
			System.out.println("Fajlovi nisu nadjeni");
			return false;
		}catch(IOException e){
			System.out.println("Greska u citanju fajla");
			return false;
		}finally{
			if(fin1!=null){
				try{
					fin1.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajla 1");
				}
			}
			if(fin2!=null){
				try{
					fin2.close();
				}catch(IOException e){
					System.out.println("Greska u zatvaranju fajla 2");
				}
			}
		}
	}
	
}
