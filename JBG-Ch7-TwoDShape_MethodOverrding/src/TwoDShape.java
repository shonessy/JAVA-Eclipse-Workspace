
abstract public class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	
	TwoDShape(){
		width=height=0;
		name="none";
		}
	
	TwoDShape(double x, String s){
		width=height=x;
		name=s;
		}
	
	TwoDShape(double a, double b, String s){
		width=a;
		height=b;
		name=s;
		}
	
	TwoDShape(TwoDShape a){
		width=a.width;
		height=a.height;
		name=a.name;
		}
	
	//setters i getters
	double getWidth(){return width;}
	void   setWidth(double a){ width=a;}
	
	double getHeight(){return height;}
	void   setHeight(double a){ height=a;}
	
	String getName(){return name;}
	void   setName(String s){ name=s;}
	
	void showDim(){
		System.out.println("Width: " + width + "\tHeight: " + height);
		}
	
	//must be overriden
	abstract double area();
	
}
