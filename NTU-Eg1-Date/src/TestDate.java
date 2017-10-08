
public class TestDate {

	public static void main(String[] args) {
		Date d1=new Date(25,5,1996);
		System.out.println("D1: " + d1);
		
		Date d2=new Date();
		d2.setDay(15);
		d2.setMonth(12);
		d2.setYear(2016);
		System.out.printf("D2: " + "%d-%d-%d\n", d2.getDay(), d2.getMonth(), d2.getYear());
		
		d1.setDate(16, 5, 2018);
		System.out.println("D1: " + d1);
		
	}

}
