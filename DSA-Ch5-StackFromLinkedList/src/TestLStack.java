
public class TestLStack {

	public static void main(String[] args) {
		StackL  stack = new StackL();
		stack.push(new Link("Milos", 54_100));
		stack.push(new Link("Uros", 13_100));
		stack.push(new Link("Jovan", 22_300));
		stack.push(new Link("Petar", 154_700));
		stack.push(new Link("Srdjan", 53_125));
		System.out.println("Stack: " + stack);
		
		System.out.println("pop(): " + stack.poop());
		System.out.println("Stack: " + stack);
		
		System.out.println("peek(): " + stack.peek());
		System.out.println("Stack: " + stack);

	}

}
