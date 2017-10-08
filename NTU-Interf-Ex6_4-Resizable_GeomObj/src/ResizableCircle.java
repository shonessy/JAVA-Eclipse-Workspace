
public class ResizableCircle extends Circle 
							implements Resizable{
	
	//Constructos
	public ResizableCircle(){
		super();
	}
	public ResizableCircle(double radius){
		super(radius);
	}
	
	//Resize
	public void resize(int percent){
		radius*=1-(double)percent/100;
	}
	
}
