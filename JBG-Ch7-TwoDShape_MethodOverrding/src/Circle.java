
public class Circle extends TwoDShape{
	
	//konstruktori
	Circle(){
		super();
		}

	Circle(double r){
		super(2*r, "Circle");
		}
	
	Circle(Circle cr){
		super(cr);
		}	
	
	//override method
	double area(){
		return Math.pow(getWidth()/2, 2)*Math.PI;
		}
	
	//override method
	void showDim(){
		System.out.println("Diameter: " + getWidth()/2);
		}
}
