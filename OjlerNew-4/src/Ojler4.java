public class Ojler4 {
	public static void main(String[] args) {
		int temp;
		int maxPal=1;
		
		for(int i=100;i<=999;i++)
			for(int j=101;j<=999;j++)
				if(checkPal(temp=i*j)){
					System.out.println(temp);
					if(temp>maxPal)
						maxPal=temp;
					}
		
		System.out.println("\nMAXPal: " + maxPal);
		
	}
	
	static boolean checkPal(int a){
		String s=Integer.toString(a);
		//boolean ind=true;
		for(int i=0;i<s.length()/2;i++)
			if( s.charAt(i)!=s.charAt(s.length()-1-i) )
				return false;
		return true;
	}
}
