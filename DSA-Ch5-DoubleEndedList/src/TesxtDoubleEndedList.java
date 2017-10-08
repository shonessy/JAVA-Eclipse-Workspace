
public class TesxtDoubleEndedList {

	public static void main(String[] args) {
		DoubleEndList dEList = new DoubleEndList();
		dEList.insertFirst(new Link("Milos", 54_100));
		dEList.insertFirst(new Link("Uros", 13_100));
		dEList.insertFirst(new Link("Jovan", 22_300));
		dEList.insertFirst(new Link("Petar", 154_700));
		dEList.insertFirst(new Link("Srdjan", 53_125));
		System.out.println("Lista: " + dEList);
		
		System.out.println("Adding at last end: ");
		dEList.insertLast(new Link("Jovana", 42_100));
		System.out.println("Lista: " + dEList);
		
		System.out.println("Adding at last end: ");
		dEList.insertLast(new Link("Ivana", 62_100));
		System.out.println("Lista: " + dEList);
		
		System.out.println("Delete first: " + dEList.deleteFirst());
		System.out.println("Lista: " + dEList);

	}

}
