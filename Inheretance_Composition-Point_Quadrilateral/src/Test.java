
public class Test {
	public static void main(String args[]){
		Point A=new Point(0,0);
		Point B=new Point(6,0);
		Point C=new Point(8,5);
		Point D=new Point(2,5);
		Cetvorougao ctv1=new Cetvorougao(A, B, C, D);
		System.out.println(ctv1);
		System.out.println("Visina: " + ctv1.getHeight());
		
	}
}
