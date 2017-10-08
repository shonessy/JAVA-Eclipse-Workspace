package snippet;

public class TestGeneric {

	public static void main(String[] args) {
		GenericClass<Integer> gn1=new GenericClass<Integer>(14);
		System.out.print("gn1: ");
		gn1.showType();
		System.out.println("Vrednost: " + gn1.getT());
		int n=gn1.getT()+1;
		System.out.println("Vrednost nakon n+1= " + n);
		System.out.println();
		
		GenericClass<Double> gn2=new GenericClass<Double>(2.84);
		System.out.print("gn2: ");
		gn2.showType();
		System.out.println("Vrednost: " + gn2.getT());
		double d=gn2.getT()+0.16;
		System.out.println("Vrednost nakon d+0.16= " + d);
		System.out.println();
		
		GenericClass<String> gn3=new GenericClass<String>
										("Zdravo deGeneriku");
		System.out.print("gn3: ");
		gn3.showType();
		System.out.println("Vrednost: " + gn3.getT());
		String s=gn3.getT() + " jedan";
		System.out.println("Vrednost nakon nadovezivanja= " + 
							s + "\n");
		
		GenericClass<Integer> gn4;
		gn4=gn1;
		System.out.print("gn4: ");
		gn4.showType();
		System.out.println("Vrednost: " + gn4.getT());
		
		//gn4=gn2;		//error
		//gn4=gn3;		//error
		
		/*
		 * Generic2P
		 */
		System.out.println("\n************************\n");
		
		//Integer-Integer
		System.out.print("gn2pII: ");
		GenericClass2P<Integer, Integer> gn2pII = new GenericClass2P
													<Integer, Integer>(7, 8);
		gn2pII.shovTypes();
		System.out.println("Vrednost T: " + gn2pII.getT());
		System.out.println("Vrednost V: " + gn2pII.getV() );
		System.out.println("T whole part: " + gn2pII.wholeT());
		System.out.println("T fraction part: " + gn2pII.fractionT());
		System.out.println("T reciprocal: " + gn2pII.reciprocalT());
		System.out.println("V whole part: " + gn2pII.wholeV());
		System.out.println("V fraction part: " + gn2pII.fractionV());
		System.out.println("V reciprocal: " + gn2pII.reciprocalV());
		System.out.println();
		
		//Double-Double
		System.out.print("gn2pID: ");
		GenericClass2P<Integer, Double> gn2pID = new GenericClass2P
													<Integer, Double>(15, 8.41);
		gn2pID.shovTypes();
		System.out.println("Vrednost T: " + gn2pID.getT());
		System.out.println("Vrednost P: " + gn2pID.getV());
		System.out.println("T whole part: " + gn2pID.wholeT());
		System.out.println("T fraction part: " + gn2pID.fractionT());
		System.out.println("T reciprocal: " + gn2pID.reciprocalT());
		System.out.println("V whole part: " + gn2pID.wholeV());
		System.out.println("V fraction part: " + gn2pID.fractionV());
		System.out.println("V reciprocal: " + gn2pID.reciprocalV());
		System.out.println();
		
		//Integer-String
		//GenericClass2P<Integer, String> gn2pIS;		// Error
		
		
		
		
	}

}
