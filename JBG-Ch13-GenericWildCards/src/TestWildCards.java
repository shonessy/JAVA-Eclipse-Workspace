
public class TestWildCards {

	public static void main(String[] args) {
		GenNum<Integer> gc1 = new GenNum<Integer>(5);
		GenNum<Integer> gc2 = new GenNum<Integer>(7);
		GenNum<Integer> gc3 = new GenNum<Integer>(-5);
		GenNum<Double>  gc4 = new GenNum<Double>(5.00);
		System.out.println("gc1 Value: " + gc1.getT());
		System.out.println("gc2 Value: " + gc2.getT());
		System.out.println("gc3 Value: " + gc3.getT());
		System.out.println("gc4 Value: " + gc4.getT());
		System.out.println();
		
		//no wildcards method
		System.out.println("|gc1|=|gc2| " + gc1.absEqual(gc2));
		System.out.println("|gc1|=|gc3| " + gc1.absEqual(gc3));
		//System.out.println("|gc1|=|gc4| " + gc1.absEqual(gc4)); //error

		//wildcards method
		System.out.println("\nWildCards");
		System.out.println("|gc1|=|gc2| " + gc1.absEqualW(gc2));
		System.out.println("|gc1|=|gc3| " + gc1.absEqualW(gc3));
		System.out.println("|gc1|=|gc4| " + gc1.absEqualW(gc4)); 
		System.out.println();
		
		
		//poziv genericke metode
		System.out.println("**********Genericka metoda: *******");
		Integer i1=5,
				i2=-7,
				i3=12;
		Double d1=5.0;
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("d1: " + d1);
		System.out.println();
		
		System.out.println("i1:i2 = " + vmj(i1, i2));
		System.out.println("i1:i3 = " + vmj(i1, i3));
		System.out.println("i1:d1 = " + vmj(i1, d1));
		System.out.println();
		
		System.out.println("gc1:gc2 = " + vmjGC(gc1, gc2));
		System.out.println("gc1:gc3 = " + vmjGC(gc1, gc3));
		System.out.println("gc1:gc4 = " + vmjGC(gc1, gc4));
		System.out.println();
		
		//obicna klasa sa generickim konsturktorom
		System.out.println("*********** Generic Constructor **********");
		GenConstructor gCon1=new GenConstructor(7.61);	//autoboxing 7.61 u Double
		System.out.println("Sumation(7.61)= " + gCon1.getSum());
		int n=84;
		//GenConstructor gCon2=new GenConstructor(num); //Error
		Integer nI=n;
		GenConstructor gCon2=new GenConstructor(nI);
		System.out.println("Sumation(81)= " + gCon2.getSum());		
		
		
	}

	//generic method
	static <T extends Number, V extends Number> int vmj(T t, V v){
		if(t.doubleValue()>v.doubleValue())
			return 1;
		else if(t.doubleValue()<v.doubleValue())
			return -1;
		return 0;
	}
	
	//generic method
	static <T extends GenNum<?>, V extends GenNum<?> > int vmjGC(T t, V v){
		if(t.getT().doubleValue()>v.getT().doubleValue())
			return 1;
		else if(t.getT().doubleValue()<v.getT().doubleValue())
			return -1;
		return 0;
	}
}
