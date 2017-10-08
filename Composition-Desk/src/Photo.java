
public class Photo {
	public String title;
	public Date date;
	
	//Constructors
	public Photo(String title, Date date){
		this.title=title;
		this.date=date;
	}
	
	//Setters & Getters
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}
	
	//toString
	@Override
	public String toString(){
		return "Photo[" + title + ", " + date + "]";
	}
}
