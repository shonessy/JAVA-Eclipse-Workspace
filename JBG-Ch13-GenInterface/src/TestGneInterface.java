
public class TestGneInterface {

	public static void main(String[] args) {
		Integer n1[]={7, 6 ,6 ,8};
		Integer n2[]={15, 47, 41, 3, 1, 2, 5};
		String  s1[]={"Ana", "Marja", "Slonce"};
		GenClass<Integer> gc1 = new GenClass<>(n1);
		GenClass<Integer> gc2 = new GenClass<>(n2);
		//GenClass<String>  gc3 = new GenClass<>(s1);
			//ne moze jer Interfejs prima samo Numbers->
			//a to mora da ispostuje i genericka klasa
		
		System.out.println("gc1/5 : " + gc1.contains(5));
		System.out.println("gc2/5 : " + gc2.contains(5));
		System.out.println("gc1/6 : " + gc1.contains(6));
		System.out.println("gc2/5 : " + gc2.contains(6));
		//System.out.println("gc3/Blavor: " + gc3.contains("Blavor"));
		//System.out.println("gc3/Marja : " +  gc3.contains("Marja"));
		



		
	}

}
