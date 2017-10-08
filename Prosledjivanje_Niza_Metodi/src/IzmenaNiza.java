

public class IzmenaNiza {
	public static void main(String Args[]){
		int niz[]={5,21,15,44,12};
		
		izmeniNiz(niz);
		System.out.println("Izmenjeni niz je : ");
		for(int x:niz)
			System.out.printf("%d  ", x);
		
		izmeniClanNiza(niz[3]);
		System.out.printf("\nIzmenjeni clan niza je(void): %d", niz[3]); //FUNKCIJA RADI SA KOPIJOM VREDNOSTI, PA NEMA EFEKTA
		
		System.out.printf("\nIzmenjeni clan niza je(return): %d", izmeniClanNiza_Return(niz[3]));	// FUNKCIJA VRACA KOPIJU VREDNOSTI, PA IMA EFEKTA
		
		
	}
	
	public static void izmeniNiz(int niz[]){
		for(int i=0;i<niz.length;i++)
			niz[i]*=2;
		}
	
	public static void izmeniClanNiza(int x){
		x+=1;
		}
	
	public static int izmeniClanNiza_Return(int x){
		return x+=1;
		}


}
