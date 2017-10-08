
public class Triangle extends TwoDShape{
	String status;
	
	//constructors
	Triangle(){
		super();
		status="none";
	}
	Triangle(double x){
		super(x);
		status="filled";
		}
	Triangle(double x, double y, String s){
		super(x,y);
		status=s;
		}
	
	//methods
	double area(){
		return getWidth()*getHeight()/2;
		}
	
	void showStyle(){
		System.out.println("Triangle is: " + status);
		}
}
