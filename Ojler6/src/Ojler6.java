import java.math.*;
public class Ojler6 {
	public static void main(String[] args){
		long s1=0,s2=0;
		for(int i=0;i<=100;i++){
			//s1+=Math.pow(i,2);
			s1+=i*i;
			s2+=i;
			}
		//s2=Math.pow(s2,2);
		s2=s2*s2;
		
		System.out.println(s2-s1);
	}
	
}
