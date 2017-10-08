
public class Triangle extends TwoDShape{
	 private String style;
	 
	 Triangle(){
		super();
		style="none";
	 	}
	 
	 Triangle(double a){
			super(a, "Triangle");
			style="filled";
		 	}
	 
	 Triangle(double a, String s){
		super(a, "Triangle");
		style=s;
	 	}
	 
	 Triangle(double w, double h, String s){
		super(w, h, "Triangle");
		style=s;
	 	}
	 
	 Triangle(Triangle t){
		super(t);
		style=t.style;
	 	}
	 
	 //setters i getters
	 String getStyle(){return style;}
	 void   setStyle(String s){style=s;}
	 
	//override method
	 double area(){
		return getWidth()*getHeight()/2; 
	 	}
	 

}
