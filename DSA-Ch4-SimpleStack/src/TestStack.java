
public class TestStack {

	public static void main(String[] args) {
		try{
			Stack stack=new Stack(5);
			stack.push(25);
			stack.push(57);
			stack.push(87);
			stack.push(11);
			stack.push(44);
			System.out.println("Current: " + stack.peek());
			System.out.println("Poped: " + stack.pop());
			System.out.println("Current: " + stack.peek());
			stack.push(12);
			System.out.println("Current: " + stack.peek());
			stack.push(15);
			System.out.println("Current: " + stack.peek());
		}catch(StackEmptyException e){
			System.out.println(e);
		}catch(StackFullException e){
			System.out.println(e);
		}
	}

}
