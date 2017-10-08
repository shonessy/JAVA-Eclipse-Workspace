
public class Point {
	private int x;
	private int y;
	
	//Constructors
	public Point(){
		this.x=0;
		this.y=0;
	}
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//Setters & Getters
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
	public Point getPoint(){
		return this;
	}
	
	//toString
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
	
	//x,y to array
	public int[] getXY(){
		int ret[]={x,y};
		return ret;
	}
	
	//setXY
	public void setXY(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//distance from (0,0)
	public double distance(){
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	//distance from A(x1, y1)
	public double distance(int x1, int y1){
		return Math.sqrt(Math.pow(x-x1, 2)+Math.pow(y-y1, 2));
	}
	
	//distance from Point
	public double distance(Point another){
		return Math.sqrt(Math.pow(x-another.x, 2)+Math.pow(y-another.y, 2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
