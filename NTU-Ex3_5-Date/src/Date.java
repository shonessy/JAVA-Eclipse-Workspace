
public class Date {
	private int year;
	private int month;
	private int day;
	
	private static String strMonths[]={"Jan", "Feb", "Mar",
								"Apr", "May", "Jun",
								"Jul", "Aug", "Sep",
								"Oct", "Nov", "Dec"};
	private static String strDays[]={"Mon", "Tue", "Wen",
							 "Thu", "Fri", "Sat",
							 "Sun"};
	private static int daysInMonths[]={31,28,31,30,31,30,31,31,30,31,30,31};
	
	//isLeap
	public static boolean isLeap(int year){
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		return false;
	}
	
	//isValidDate
	public static boolean isValidDate(int day, int month, int year){
		if(year<1 || year>9999)
			return false;
		if(month<1 || month>12)
			return false;
		if(day<1)
			return false;
		if(isLeap(year) && month==2 && day<30)
			return true;
		if(day>daysInMonths[month-1])
			return false;
			
		return true;
	}
	
	//getDayOfWeek
	public static int getDayOfWeek(int day, int month, int year){
		if(!isValidDate(day, month, year))
			return -1;					//error
		int ret=0;
		//tomohiko sakamoto algoritam
		final int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        year = (month < 3) ? year-1 : year;
        ret= (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        return (ret==0) ? 7 : ret;
	}
	
	//Constructors
	public Date(int day, int month, int year){
		if(!isValidDate(day, month, year))
			System.out.println("Can't create object-Invalid date");
		else
			setDate(day, month, year);
	}
	
	//setDate
	public void setDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	//maxDay in month
	public int maxDayInMonth(){
		if(isLeap(year) && month==2)
			return 29;
		else
			return daysInMonths[month-1];
	}
	
	//Setters & Getters
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		if(day>=1 && day<=maxDayInMonth())
			this.day=day;
		else
			System.out.println("Uneli ste neispravan datum");
	}
	public void setMonth(int month){
		if(month>=1 && month<=12)
			this.month=month;
		else
			System.out.println("Uneli ste neispravan datum");
	}
	public int getMonth(){
		return month;
	}
	public void setYear(int year){
		if(year>=1 && year<=9999)
			this.year=year;
		else
			System.out.println("Uneli ste neispravan datum");
	}
	public int getYear(){
		return year;
	}
	
	//toString
	public String toString(){
		return strDays[getDayOfWeek(day, month, year)-1] + " " +  
			   day + "." + strMonths[month-1] + " " + year;
	}
	
	//next Day
	public Date nextDay(){
		day++;
		if(day>maxDayInMonth()){
			day=1;
			nextMonth();
		}
		return this;
	}
	//previousDay
	public Date previousDay(){
		day--;
		if(day==0){
			day=maxDayInMonth();
			previousMonth();
		}
		return this;
	}
	
	//next Month
	public Date nextMonth(){
		month++;
		if(month>12){
			month=1;
			nextYear();
		}
		if(day==31)
			day=maxDayInMonth();
		return this;
	}
	//previousMonth
	public Date previousMonth(){
		month--;
		if(month==0){
			month=12;
			previousYear();
		}
		if(day==31)
			day=maxDayInMonth();
		return this;
	}
	
	//next Year
	public Date nextYear(){
		year++;//feb
		if(isLeap(year-1) && month==2 && day==29)
			day=28;
		return this;
	}
	//previousYear
	public Date previousYear(){
		year--;
		if(isLeap(year+1) && month==2 && day==29)
			day=28;
		return this;
	}
	
	
}
