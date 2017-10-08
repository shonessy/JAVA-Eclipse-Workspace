
public class Date {
	private int year;
	private int month;
	private int day;
	
	//Constructors
	public Date(){
		this.day=1;
		this.month=1;
		this.year=1000;
	}
	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	//Setters & Getters
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		this.day=day;
	}
	
	
	/*
	 * Methods Level1(non-Javadoc)
	 */
	
	//Override toString
	public String toString(){
		return String.format("%02d/%02d/%4d", day, month, year);
	}
	
	//setDate
	public void setDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
}
