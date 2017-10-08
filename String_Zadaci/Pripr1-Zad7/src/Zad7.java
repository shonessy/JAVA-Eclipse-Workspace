import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		String brStr;
		char brChr[]=null;
		boolean brOk=false;
		
		while(!brOk){
			brOk=true;
			System.out.print("Unesite broj za obrtanje: ");
			brStr=unos.nextLine();
			brChr=brStr.toCharArray();
			for(int i=0;i<brChr.length;i++){
				if(brChr[i]<'0' || brChr[i]>'9')
					brOk=false;
				}
			if(!brOk) System.out.println("Neispravan unos");
			}
		
		char brChrRev[]=new char[brChr.length];
		for(int i=0;i<brChr.length;i++)
			brChrRev[i]=brChr[brChr.length-1-i];
		
		String brStrRev= new String(brChrRev);
		System.out.println("\n" + brStrRev);

	}

}
