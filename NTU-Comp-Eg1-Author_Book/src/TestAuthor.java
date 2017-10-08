
public class TestAuthor {

	public static void main(String[] args) {
		Author a1=new Author("Joshua Block", "jbj@gmail.com", 'm');
		System.out.println(a1);
		
		a1.setEmail("jbjava@gmail.com");
		System.out.println(a1.getEmail());
	}

}
