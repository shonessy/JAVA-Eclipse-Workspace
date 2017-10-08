
public class TestBubbleSort {

	public static void main(String[] args) {
		ArrayWithBubbleSort aBubble = new ArrayWithBubbleSort(50);
		for(int i=0; i<15; i++)
			aBubble.insert((int)(Math.random()*100));
		System.out.println("Niz: ");
		System.out.println(aBubble);
		System.out.println("Sortirani niz: ");
		//aBubble.bubbleSort();
		//aBubble.selectionSort();
		aBubble.insertionSort();
		System.out.println(aBubble);
		System.out.println("-------------------------------------");
		
		int size=100_000;
		ArrayWithBubbleSort testArray=new ArrayWithBubbleSort(size);
		ArrayWithBubbleSort testBubleSort=new ArrayWithBubbleSort(size);
		ArrayWithBubbleSort testBidirBubleSort=new ArrayWithBubbleSort(size);
		ArrayWithBubbleSort testOddEvenSort=new ArrayWithBubbleSort(size);
		ArrayWithBubbleSort testSelectionSort=new ArrayWithBubbleSort(size);
		ArrayWithBubbleSort testInsertionSort=new ArrayWithBubbleSort(size);
		
		for(int i=0; i<size; i++)
			testArray.insert( (int) (Math.random()*(size-1)) );
		//System.out.println("Test Array[" + size + "]: \n\t " + testArray);
		testBubleSort.copyArray(testArray);
		testBidirBubleSort.copyArray(testArray);
		testOddEvenSort.copyArray(testArray);
		testSelectionSort.copyArray(testArray);
		testInsertionSort.copyArray(testArray);
		
		//bubble sort
		long start=System.nanoTime();
		testBubleSort.bubbleSort();
		long finish=System.nanoTime();
		System.out.println("Bubble Sort: " + (finish-start)/1_000_000 + "[ms] ");
		//System.out.println("\t " + testBubleSort);
		
		//bidirectional bubble sort
		start=System.nanoTime();
		testBidirBubleSort.bidirBubbleSort();
		finish=System.nanoTime();
		System.out.println("Bidirectional Bubble Sort: " + (finish-start)/1_000_000 + "[ms] ");
		//System.out.println("\t " + testBidirBubleSort);
		
		//odd-even sort
		start=System.nanoTime();
		testOddEvenSort.oddEvenSort();
		finish=System.nanoTime();
		System.out.println("Odd-Even Sort: " + (finish-start)/1_000_000 + "[ms] ");
		//System.out.println("\t " + testOddEvenSort);
		
		//selection sort
		start=System.nanoTime();
		testSelectionSort.selectionSort();
		finish=System.nanoTime();
		System.out.println("Selection Sort: " + (finish-start)/1_000_000 + "[ms] ");
		//System.out.println("\t " + testSelectionSort);
		
		//insetion sort
		start=System.nanoTime();
		testInsertionSort.insertionSort();
		finish=System.nanoTime();
		System.out.println("Insection Sort: " + (finish-start)/1_000_000 + "[ms] ");
		//System.out.println("\t " + testInsertionSort);
		
		System.out.println("-------------------------------------");

		System.out.println("testBubleSort==testBidirBubleSort: " + 
				testBubleSort.areEqual(testBidirBubleSort) );
		System.out.println("testBubleSort==testOddEvenSort: " + 
				testBubleSort.areEqual(testOddEvenSort) );
		System.out.println("testBubleSort==testSelectionSort: " + 
							testBubleSort.areEqual(testSelectionSort) );
		System.out.println("testSelectionSort==testInsertionSort: " + 
				testSelectionSort.areEqual(testInsertionSort) );
		System.out.println("testBubleSort==testInsertionSort: " + 
				testBubleSort.areEqual(testInsertionSort) );
		
		System.out.println("-------------------------------------");

		//System.out.println("Median testBubbleSort: " + testBubleSort.median(true));
		//System.out.println("Median testArray: " + testArray.median(false));

		System.out.println("-------------------------------------");

		System.out.println("Removing dups: ");
		//testBubleSort.noDups();
		//System.out.println("Length: " + testBubleSort.length());
		//System.out.println("\t" + testBubleSort);
		System.out.println("-------------------------------------");

	}

}