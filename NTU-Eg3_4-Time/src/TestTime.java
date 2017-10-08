
public class TestTime {

	public static void main(String[] args) {
		Time t1=new Time(15,25,34);
		System.out.println(t1);
		
		t1.setSecond(59);
		System.out.println(t1);
		System.out.println(t1.nextSecond());
		
		t1.setTime(23, 59, 59);
		System.out.println(t1);
		System.out.println(t1.nextSecond().nextSecond());
		
		t1.setHour(28);
	}

}
