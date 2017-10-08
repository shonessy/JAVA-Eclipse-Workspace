
public class TestSortedLinkedList {

	public static void main(String[] args) {
		SortedLinkList sList = new SortedLinkList();
		System.out.println("isEmpty(): " + sList.isEmpty());
		
		sList.insert(new Link("Milos", 54_100));
		sList.insert(new Link("Uros", 13_100));
		sList.insert(new Link("Jovan", 22_300));
		sList.insert(new Link("Petar", 154_700));
		sList.insert(new Link("Srdjan", 53_125));
		sList.insert(new Link("Andrija", 17_755));
		System.out.println("Queue: " + sList);
		
		System.out.println("remove(): " + sList.removeFirst());
		System.out.println("Queue: " + sList);
		
	}

}
