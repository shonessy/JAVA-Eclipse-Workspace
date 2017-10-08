
public class Ojler3 {

	public static void main(String[] args) {
		long prosti[]=new long[1000];
		prosti[0]=2;
		prosti[1]=3;
		
		for(long i=4;i<500000;i++){
			int j=0;
			int ind=0;
			for(j=0;prosti[j]!=0 && j<999;j++){
				if(i%prosti[j]==0){
					ind++;
					break;
					}
				}
			if(ind==0)
				prosti[j]=i;
			}//for
		
		for(int i=0;prosti[i]!=0 && i<prosti.length-1;i++)
			System.out.println(prosti[i]);
		
	}

}
