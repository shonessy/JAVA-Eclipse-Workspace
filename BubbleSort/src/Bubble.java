
public class Bubble {
	int niz[];
	static int a=10;
	//constructor 
	Bubble(int a[]){
		niz=a; //new int[size];
	}
	
	//fill niz
	/*void fill(int a[]){
		for(int i=0; i<a.length; i++)
			niz[i]=a[i];		
	}*/
	static void set_a(int x){
		a=x;
	}
	static int get_a(){
		return a;
	}
	
	
	int[] sort(){
		int temp;
		for(int i=1; i<niz.length; i++)
			for(int j=niz.length-1; j>=i; j--)
				if(niz[j-1]>niz[j]){
					temp=niz[j-1];
					niz[j-1]=niz[j];
					niz[j]=temp;
				}
		return niz;
	}
}
