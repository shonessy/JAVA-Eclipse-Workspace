
public class TestMerging {

	//------------------------------------------//
	//merge 2 arrays
	public int[] merge(int a[], int b[]) {
		int ret[]=new int[a.length + b.length];
		int indexA=0,
			indexB=0,
			indexC=0;
		while(indexA<a.length && indexB<b.length)
			ret[indexC++] = (a[indexA]<=b[indexB]) ? a[indexA++] : b[indexB++];
		
		while(indexA<a.length)
			ret[indexC++] = a[indexA++];
		while(indexB<b.length)
			ret[indexC++] = b[indexB++];
		
		return ret;
	}
	
	//------------------------------------------//
	//array to string
	public String array2String(int a[]) {
		String ret="\t";
		for(int x : a)
			ret+=x + ", ";
		return ret;
	}
	//------------------------------------------//
	public static void main(String[] args) {
		TestMerging testMerging = new TestMerging();
		
		int a[]={23,47,55,81,95};
		int b[]={7,14,39,55,62,74};
		int c[]=testMerging.merge(a, b);
		System.out.println("Niz A: " + testMerging.array2String(a));
		System.out.println("Niz B: " + testMerging.array2String(b));
		System.out.println("Niz C: " + testMerging.array2String(c));
	}

}
