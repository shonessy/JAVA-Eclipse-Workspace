
public class ShowBitsDemo {

	public static void main(String[] args) {
		ShowBits sh8=new ShowBits(8);
		ShowBits sh32=new ShowBits(32);
		ShowBits sh64=new ShowBits(64);
		
		sh8.show(123);
		sh32.show(87987);
		sh64.show(237658768);
		sh8.show(237658768);


	}

}
