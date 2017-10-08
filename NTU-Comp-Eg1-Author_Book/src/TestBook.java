
public class TestBook {

	public static void main(String[] args) {
		Author a1=new Author("Herber Shmit", "hb@gmail.com", 'm');
		Book b1=new Book("Java BiG", a1, 24.99, 5);
		
		System.out.println(b1);
		
		System.out.println("Author's name : " + b1.getAuthor().getName());
		System.out.println("Author's email: " + b1.getAuthor().getEmail());
		
		System.out.println("Author's name from book: " + b1.getAuthorName());
	}

}
