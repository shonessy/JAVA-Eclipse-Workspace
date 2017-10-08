
public class Time {
	private int second=0;
	private int minute=0;
	private int hour=0;
	
	//Constructors
	public Time(){
		this.second=0;
		this.minute=0;
		this.hour=0;
	}
	public Time(int hour, int minute, int second){
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	
	//Setters & Getters
	public int getSecond(){
		return second;
	}
	public int getMinute(){
		return minute;
	}
	public int getHour(){
		return hour;
	}
	public void setSecond(int second){
		if(second>=0 && second<=59)
			this.second=second;
		else
			System.out.println("Error: Invalid seconds value");
	}
	public void setMinute(int minute){
		if(minute>=0 && minute<=59)
			this.minute=minute;
		else
			System.out.println("Error: Invalid minutes value");
		}
	public void setHour(int hour){
		if(hour>=0 && hour<=23)
			this.hour=hour;
		else
			System.out.println("Error: Invalid hour value");
	}
	
	
	/*
	 * Methods Level 1
	 */
	
	//toString
	public String toString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	//setTime
	public void setTime(int hour, int minute, int second){
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	
	//nextSecond
	public Time nextSecond(){
		this.second++;
		if(second==60){
			second=0;
			minute++;
			if(minute==60){
				minute=0;
				hour++;
				if(hour==24)
					hour=0;
			}
		}
		return this;
	}
	
	
	
	
}
