
public class Ojler5 {
	public static void main(String[] args){
		int maxDivider=20;
		long prod=1;
		
		Prost.nadjiProste(maxDivider);
		
		for(int i=2;i<=maxDivider;i++){
			if(Prost.isProst(i)){
				prod*=i;
				for(int j=2;j<10;j++){
					if(Math.pow(i, j)<=maxDivider)
						prod*=i;
					else 
						break;
					}
				}
			}
		
		
		System.out.print(prod);
		//Prost.stampajProste();
		
	}

}
