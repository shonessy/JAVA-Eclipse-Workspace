
public class TestLinkedList {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		
		list.insertFirst("Jovan", 54_000);
		list.insertFirst(new Link("Milos", 44_100));
		list.insertFirst("Slavisa", 12_100);
		list.insertFirst("Timotije", 52_100);
		list.insertFirst("Matija", 22_100);
		list.insertFirst("Uros", 15_600);
		
		System.out.println("Lista [f->l]: \n" + list);
		
		System.out.println("removedFirst(): " + list.deleteFirst());
		System.out.println("Lista [f->l]: \n" + list);
		
		System.out.println("find Slavisa: " + list.findByName("Slavisa"));
		System.out.println("find Marko: " + list.findByName("Marko"));
		System.out.println("find 52_100: " + list.findBySalary(52_100));
		System.out.println("find 72_100: " + list.findBySalary(72_100));
		System.out.println();
		
		System.out.println("delete Slavisa: " + list.deleteByName("Slavisa"));
		System.out.println("delete Marko: " + list.deleteByName("Marko"));
		System.out.println("delete 52_100: " + list.deleteBySalary(52_100));
		System.out.println("delete 72_100: " + list.deleteBySalary(72_100));
		System.out.println();
		
		System.out.println("Lista [f->l]: \n" + list);
		
	}

}
