
public class Prost {

		static int broj;
		static boolean prosti[];//new boolean[broj+1];}
		
		/*public Prost(int a)	{
			broj=a;
			prosti=new boolean[broj+1];
			}*/
	
	
	public static void nadjiProste(int max){
		broj=max;
		prosti=new boolean[broj+1];
		prosti[0]=prosti[1]=false;
		for(int i=2;i<=broj;i++)
			prosti[i]=true;
		
		int n=(int)Math.ceil(Math.sqrt(broj));
		for(int i=0;i<=n;i++){
			if(prosti[i]){
				for(int j=2*i;j<=broj;j+=i)
					prosti[j]=false;
				}
			}
		}
	
	public static void stampajProste(){
		System.out.println();
		for(int i=2;i<=broj;i++){
			if(prosti[i])
				System.out.print(i+"\t");
			}
		System.out.println();
		}
	
	public static boolean isProst(int i){	// true ako je prost, false ako nije
		return prosti[i];
		}

}
