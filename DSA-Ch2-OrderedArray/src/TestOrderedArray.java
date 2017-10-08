
public class TestOrderedArray {

	public static void main(String[] args) {
		
		OrderedArray oArray=new OrderedArray(50);
		System.out.println("Limit niza 50 elemenata");
		System.out.println("Max: " + oArray.getMax());
		
		for(int i=0; i<20; i++)
			oArray.insert((int)Math.floor(Math.random()*100));
		
		oArray.insert(8);
		oArray.insert(54);
		oArray.insert(66);
		oArray.insert(97);
		oArray.insert(5);
		
		System.out.println("Duzina niza : " + oArray.length());
		System.out.println("Niz: ");
		System.out.println(oArray);
		
		System.out.println("find(8): " + oArray.find(8));
		System.out.println("find(91): " + oArray.find(91));
		System.out.println("delete(97): " + oArray.delete(97));
		System.out.println(oArray);
		System.out.println("delete(98): " + oArray.delete(98));
		System.out.println(oArray);
		System.out.println("Max: " + oArray.getMax());
		System.out.println("removeMax(): " + oArray.removeMax());
		System.out.println(oArray);
		
		
		OrderedArray oArray2=new OrderedArray(50);
		for(int i=0; i<5; i++)
			oArray2.insert((int)Math.floor(Math.random()*100));
		System.out.println("Niz 2: ");
		System.out.println(oArray2);
		
		OrderedArray oArrayMerged = oArray.merge(oArray2);
		System.out.println("\nNadovezani: ");
		System.out.println(oArrayMerged);
		
	}

}
