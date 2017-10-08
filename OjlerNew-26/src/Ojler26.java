import java.math.BigDecimal;

public class Ojler26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l=1.0/983.0;
		String s=Double.toString(l);
		System.out.println(s);
		
		BigDecimal b1=new BigDecimal(1.0);
		BigDecimal lb=new BigDecimal(2.0);
		lb=b1.divide(lb);
		System.out.println(lb);
	}

}
