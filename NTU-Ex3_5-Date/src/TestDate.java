
public class TestDate {

	public static void main(String[] args) {
		System.out.println(Date.isLeap(1996));
		System.out.println(Date.isValidDate(31, 5, 2001));
		
		System.out.println(Date.getDayOfWeek(14, 2, 2012));
		
		Date d1=new Date(30,12,2015);
		System.out.println(d1);
		d1.nextDay();
		System.out.println(d1);
		d1.nextDay();
		System.out.println(d1);
		d1.setDate(29, 2, 2012);
		System.out.println(d1);
		System.out.println(d1.nextMonth());
		System.out.println(d1.previousMonth());
		System.out.println(d1.nextYear());
	}

}
