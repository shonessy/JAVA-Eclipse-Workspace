
public class TestDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkList dLList = new DoubleLinkList();
		
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Delete first: " + dLList.deleteFirst());
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Delete last: " + dLList.deleteLast());
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Delete Bojana: " + dLList.deleteElement(
				new Link("Bojana", 45_350)));
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		dLList.insertFirst(new Link("Milos", 54_100));
		System.out.println("Lista: " + dLList);
		System.out.println("Delete first: " + dLList.deleteFirst());
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		dLList.insertFirst(new Link("Uros", 13_100));
		System.out.println("Lista: " + dLList);
		System.out.println("Delete last: " + dLList.deleteLast());
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		dLList.insertFirst(new Link("Jovan", 22_300));
		dLList.insertFirst(new Link("Petar", 154_700));
		dLList.insertFirst(new Link("Srdjan", 53_125));
		dLList.insertFirst(new Link("Vlado", 14_899));
		dLList.insertFirst(new Link("Aleksandar", 50));
		dLList.insertFirst(new Link("Vulin", 60_000));
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Inserting last: ");
		dLList.insertLast(new Link("Jovana", 17_445));
		System.out.println("Lista: " + dLList);
		
		System.out.println("Inserting last: ");
		dLList.insertLast(new Link("Ana", 64_300));
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Insert Simonida after Andjelija:");
		dLList.insertAfter(new Link("Andjelija", 14_200), 
						   new Link("Simonida", 11_100));
		System.out.println("Lista: " + dLList);
		
		System.out.println("Insert Bojana after Jovan:");
		dLList.insertAfter(new Link("Jovan", 22_300),
						   new Link("Bojana", 45_350));
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Delete first: " + dLList.deleteFirst());
		System.out.println("Lista: " + dLList);
		
		System.out.println("Delete first: " + dLList.deleteFirst());
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Delete last: " + dLList.deleteLast());
		System.out.println("Lista: " + dLList);
		
		System.out.println("Delete last: " + dLList.deleteLast());
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
		//
		System.out.println("Delete Ibrahim: " + dLList.deleteElement(
				new Link("Ibrahim", 25_350)));
		System.out.println("Lista: " + dLList);
		
		System.out.println("Delete Bojana: " + dLList.deleteElement(
												new Link("Bojana", 45_350)));
		System.out.println("Lista: " + dLList);
		System.out.println("--------------------------------------");
		
	}

}
