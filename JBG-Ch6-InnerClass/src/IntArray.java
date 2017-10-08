
public class IntArray {
	private int niz[];
	
	public IntArray(int n[]) {
		niz=n;
		}
	
	void analizeArray(){
		Inner inObj=new Inner();
		System.out.println("Najveci clan niza: " + inObj.max() );
		System.out.println("Najmanji clan niza: " + inObj.min() );
		System.out.println("Prosjecna vrijednost: " + inObj.avg() );
		}
	
	//inner class
	class Inner{
		
		//minimum
		int min(){
			int min=niz[0];
			for(int i=1;i<niz.length;i++)
				if(niz[i]<min)
					min=niz[i];
			return min;
			}
		
		//maximum
		int max(){
			int max=niz[0];
			for(int i=1;i<niz.length;i++)
				if(niz[i]>max)
					max=niz[i];
			return max;
			}
		
		//average
		double avg(){
			int s=0;
			for(int i=0;i<niz.length;i++)
				s+=niz[i];
			return (double)s/niz.length;
			}
		
		}//inner class

}
