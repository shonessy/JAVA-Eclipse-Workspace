
public class Test {
	public static final int ARRAY_LIMIT=100;
	public static final int ARRAY_LENGTH=ARRAY_LIMIT;
	
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort(ARRAY_LIMIT);
		for(int i=0; i<ARRAY_LENGTH; i++){
			bs.insert((int)(Math.random()*ARRAY_LIMIT*10));
		}
		BubbleSort bs2=new BubbleSort(bs);
		BubbleSort bs3=new BubbleSort(bs);
		
		System.out.println("Duzina niza: " + bs.getLength());
		System.out.println("Niz1: " + bs);
		System.out.println("Niz2: " + bs2);
		System.out.println("Niz3: " + bs3);
		System.out.println();
		
		int unit=1_000;
		long start=System.nanoTime();
		bs.bubbleSort();
		long stop=System.nanoTime();
		long bubbleT=(stop-start)/unit;
		
		start=System.nanoTime();
		bs2.selectionSort();
		stop=System.nanoTime();
		long selectionT=(stop-start)/unit;
		
		start=System.nanoTime();
		bs3.insertionSort();
		stop=System.nanoTime();
		long insertionT=(stop-start)/unit;
		
		System.out.println("Sortirani Niz1-BubbleSort: " + bubbleT + "[us]" + bs);
		System.out.println("Sortirani Niz2-SelectionSort: " + selectionT + "[us]" + bs2);
		System.out.println("Sortirani Niz3-InsertionSort: " + insertionT + "[us]" + bs3);
	}
	
}
