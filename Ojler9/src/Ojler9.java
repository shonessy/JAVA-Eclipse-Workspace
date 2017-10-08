
public class Ojler9 {

	public static void main(String[] args) {
		int a=1,b=1;
		boolean t=false;
		for(a=1;a<=1000;a++){
			for(b=a+1;b<=1000;b++){
				if(1000*(a+b)-a*b==500000){
					t=true;
					break;
					}
				}
			if(t)
				break;
			}
		int c=(int)Math.sqrt(a*a+b*b);
		System.out.println("a= " + a + "\tb= " + b + "\tc= " + c);
		System.out.print(a*b*c);
		
	}

}
