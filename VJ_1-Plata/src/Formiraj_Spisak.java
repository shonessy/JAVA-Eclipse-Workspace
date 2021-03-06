import java.io.*;
import java.util.Scanner;

public class Formiraj_Spisak {
	public static void main(String[] args){
	String imePrez;
	//int godStaz;
	//float koef;
	float ukupnoBruto=0, ukupnoPoreza=0, ukupnoNeto=0;
	Scanner unos=new Scanner(System.in);
	Plata plata;
	
	System.out.print("Unesite osnovicu: ");
	Plata.setOsnovica(unos.nextFloat());
	
	try{
		BufferedReader listaRadnika=new BufferedReader(new FileReader("/media/shonesy/Dopunski/Eclipse JAVA WorkSpace/Lista_Radnika.txt"));
		BufferedWriter listaPlata= new BufferedWriter(new FileWriter("/media/shonesy/Dopunski/Eclipse JAVA WorkSpace/Lista_Plata"));
		listaPlata.write("Ime i prezime\tOsnovica\tKoeficijent\tGodine Staza\tBruto Dohodak\tStopa Poreza\tPorez\tNeto Dohodak");
		listaPlata.newLine();
		
		while( ( imePrez=listaRadnika.readLine() ) !=null ){
			plata=new Plata(imePrez, Integer.parseInt(listaRadnika.readLine()), Float.parseFloat(listaRadnika.readLine()));
			ukupnoBruto+=plata.izracunajBrutoDohodak();
			ukupnoPoreza+=plata.izracunajPorez();
			ukupnoNeto+=plata.izracunajNeto();
			listaPlata.write(plata.dajZapis());
			listaPlata.newLine();
			System.out.println("Ime i prezime\tOsnovica\tKoeficijent\tGodine Staza\tBruto Dohodak\tStopa Poreza\tPorez\tNeto Dohodak");
			System.out.println(plata.dajZapis());
			}
		listaPlata.write("----------------------------TOTAL---------------------------");
		listaPlata.newLine();
		listaPlata.write("BRUTO: "+ ukupnoBruto);
		listaPlata.newLine();
		listaPlata.write("POREZ: "+ ukupnoPoreza);
		listaPlata.newLine();
		listaPlata.write("NETO: "+ ukupnoNeto);
		listaPlata.newLine();
		
		}
	catch(IOException e){
		System.out.println("Greska: "+e);
		}
		
	}
}
