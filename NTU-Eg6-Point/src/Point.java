
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
	
	//Seters & Getters
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	
	/*
	 * Methods
	 */
	
	//toString
	public String toString(){
		return String.format("(%d,%d)", x,y);
	}
	
	//getXY
	public int[] getXY(){
		int ret[]={x,y};
		return ret;
	}
	
	//setXY
	public void setXY(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//Distance from this to (0,0)
	public double distance(){
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	//Distance from this to (x1, y1)
	public double distance(int x1, int y1){
		return Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));
	}
	
	//Distance from this to P1(x1, y1)
	public double distance(Point another){
		return Math.sqrt(Math.pow(another.x-x, 2)+Math.pow(another.y-y, 2));
	}
	
	
	
	
	
}
