
public class TwoDShape {
	private double width;
	private double height;
	
	TwoDShape(){
		width=height=0.0;
		}
		
	TwoDShape(double x){
		width=height=x;
		}
	
	TwoDShape(double a, double b){
		width=a;
		height =b;
		}
	
	//setters and getters
	double getWidth()	{ return width; }
	double getHeight()	{ return height; }
	void setWidth(double a) { width=a; }
	void setHeight(double b) { height=b; }
	
	void showDimensions(){
		System.out.println("Width: " + width + "\t Height: " + height);
		}
		
}
