
public class TestSorting {

	public static void main(String[] args) {
		int niz[]=new int[10];
		SortList sList = new SortList();
		
		String nizNS="\t";
		for(int i=0; i<niz.length; i++){
			niz[i]=(int)(Math.random()*100);
			nizNS+=niz[i] + "   ";
		}
		System.out.println("Nesortirani Niz: ");
		System.out.println(nizNS);
		
		for(int i=0; i<niz.length; i++)  
			sList.insert(new Link(niz[i]));
		String nizS="\t";
		for(int i=0; i<niz.length; i++){
			niz[i]=sList.removeFirst().getValue();
			nizS+=niz[i] + "   ";
		}
		
		System.out.println("Sortirani Niz: ");
		System.out.println(nizS);

	}

}
