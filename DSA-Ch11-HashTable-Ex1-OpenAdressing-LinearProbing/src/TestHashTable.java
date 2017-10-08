
public class TestHashTable {

	public static void main(String[] args) {
		
		HashTable hs=new HashTable(50);
		
		hs.insert(new Employee("Uros", 240));
		hs.insert(new Employee("Marko", 780));
		hs.insert(new Employee("Jovan", 325));
		hs.insert(new Employee("Petar", 441));
		hs.insert(new Employee("Blagoje", 150));
		hs.insert(new Employee("Slavko", 680));
		hs.insert(new Employee("Ana", 470));
		hs.insert(new Employee("Jovana", 900));
		
		//insert more
		hs.insert(new Employee("Teodora", 380));
		hs.insert(new Employee("Ivana", 350));
		hs.insert(new Employee("Una", 400));
		hs.insert(new Employee("Milosav", 1200));
		
		System.out.println("Hash Table: ");
		System.out.println(hs);
		System.out.println();
		
		//delete jovana
		System.out.println("Delete 900: " + hs.delete(900));
		System.out.println("Delete 935: " + hs.delete(935));
		System.out.println(hs);
		System.out.println();
		
		//find
		System.out.println("Find 1275: " + hs.find(1275) );
		System.out.println("Find 1200: " + hs.find(1200) );
		System.out.println("Find 441: " +  hs.find(441)  );

	}

}
