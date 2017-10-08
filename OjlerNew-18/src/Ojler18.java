// NIJE ZAVRSENO, NE RADI DOBRO AKO SE U SLEDECEM REDU NALAZE DVA ISTA BROJA
public class Ojler18 {
	public static void main(String[] args) {
		Ojler18 o18 = new Ojler18();
		
		int s=triangle[0][0] + triangle[1][0];
		for(int i=2, j=0; i<triangle.length; i++){
			if(j==0){
				int rez[]=o18.max_FL( triangle[i][j], triangle[i][j+1] );
				s+=rez[0];
				j+=rez[1];
			}
			else if(j>0 && j<triangle[i].length-1){
				int rez[]=o18.max_3( triangle[i][j-1], triangle[i][j], triangle[i][j+1] );
				s+=rez[0];
				j+=rez[1];
			}
			else{
				int rez[]=o18.max_FR( triangle[i][j-1], triangle[i][j] );
				s+=rez[0];
				j+=rez[1];
			}
		}// for
		
		
		
		
		
		
		System.out.println(s );
		
}
	//max3() method
	int[] max_3(int a, int b, int c){
		int ret[]=new int[2];
		ret[0]= Math.max(a, Math.max(b, c) );
		if(ret[0]==a)
			ret[1]=-1;
		else if(ret[0]==b)
			ret[1]=0;
		else
			ret[1]=1;
		return ret;
	}
	
	//max_FL() method
	int[] max_FL(int a, int b){
		int ret[]=new int[2];
		ret[0]=(a>=b) ? a : b;
		ret[1] =(a>b) ? 0 : 1;
		return ret;
	}
	
	//max_FR() method
	int[] max_FR(int a, int b){
		int ret[]=new int[2];
		ret[0]=(a>=b) ? a : b;
		ret[1] =(a>b) ? -1 : 0;
		return ret;
	}
	
	
	private static int[][] triangle = {  // Mutable
			{75},
			{95,64},
			{17,47,82},
			{18,35,87,10},
			{20, 4,82,47,65},
			{19, 1,23,75, 3,34},
			{88, 2,77,73, 7,63,67},
			{99,65, 4,28, 6,16,70,92},
			{41,41,26,56,83,40,80,70,33},
			{41,48,72,33,47,32,37,16,94,29},
			{53,71,44,65,25,43,91,52,97,51,14},
			{70,11,33,28,77,73,17,78,39,68,17,57},
			{91,71,52,38,17,14,91,43,58,50,27,29,48},
			{63,66, 4,68,89,53,67,30,73,16,69,87,40,31},
			{ 4,62,98,27,23, 9,70,98,73,93,38,53,60, 4,23},
		};

}
