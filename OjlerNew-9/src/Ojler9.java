
public class Ojler9 {
	public static void main(String[] args) {
		int a=1,b=1,c=1;
		
		L1:{
			for(a=1;a<1000; a++)
				for(b=a+1;b<1000;b++)
					for(c=b+1;c<1000;c++)
						if(a+b+c==1000 && c*c==a*a+b*b)
							break L1;
		}
		
		
		System.out.println("a: " + a + "\t b: " + b + "\t c: " + c);
		System.out.println("Prod: " + (a*b*c) );
		
	}
}
