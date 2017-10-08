
public class Knjiga {
	private String ime;
	private int brojStrana;
	private static int brojKnjiga=0;
	/////////////////////////////////////////////////////////////////////////
	public Knjiga(String a, int b){
		ime=a;
		brojStrana=b;
		brojKnjiga++;
		}
	public Knjiga(String a){
		ime=a;
		brojKnjiga++;
		}
	public Knjiga(int b){
		brojStrana=b;
		brojKnjiga++;
		}
	public Knjiga(){
		ime=null;
		brojStrana=0;
		brojKnjiga++;
		}
	///////////////////////////////////////////////////////////////////////////////////
	
	public void setIme(String s){
		ime=s;
		}
	public String getIme(){
		return ime;
		}
	
	public void setBrojStrana(int n){
		brojStrana=n;
		}
	public int getBrojStrana(){
		return brojStrana;
		}
	
	public void getKnjiga(){
		System.out.printf("Knjiga se zove %s i ima %d stana\n", getIme(), getBrojStrana());
		}
	
	public static int getBrojKnjiga(){
		return brojKnjiga;
		}
	
}
