
public class Ball {
	private double x;
	private double y;
	private double xStep;
	private double yStep;
	
	//Constructors
	public Ball(double x, double y, double xStep, double yStep){
		this.x=x;
		this.y=y;
		this.xStep=xStep;
		this.yStep=yStep;
	}
	
	//Setters & Getters
	public double getX(){
		return x;
	}
	public double getY() {
		return y;
	}
	public double getXStep() {
		return xStep;
	}
	public double getYStep() {
		return yStep;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y ) {
		this.y=y;
	}
	public void setXStep(int xStep) {
		this.xStep=xStep;
	}
	public void setYStep(double yStep){
		this.yStep=yStep;
	}
	
	//toString
	public String toString(){
		return String.format("Ball@(%.2f, %.2f), "
							+"Speed=(%.2f, %.2f)",
							x, y, xStep, yStep);
	}
	
	public double[] getXY(){
		double ret[]={x,y};
		return ret;
	}
	public double[] getXYStep(){
		double ret[]={xStep, yStep};
		return ret;
	}
	public void setXY(double x, double y){
		this.x=x;
		this.y=y;
	}
	public void setXYStep(double xStep, double yStep){
		this.xStep=xStep;
		this.yStep=yStep;
	}
	
	public Ball move(){
		x+=xStep;
		y+=yStep;
		return this; 
	}
	
	
	
	
}
