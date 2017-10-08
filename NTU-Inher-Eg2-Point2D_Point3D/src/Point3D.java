
public class Point3D extends Point2D{
	private int z;
	
	//Constructors
	public Point3D(){
		super();
		z=0;
	}
	public Point3D(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	
	//Setters & Getters
	public void setZ(int z){
		this.z=z;
	}
	public int getZ(){
		return this.z;
	}
	
	
	//toString
	@Override
	public String toString(){
		return "(" + super.getX() + "," + 
				super.getY() + "," + z + ")";
	}
	
	
	
	
	
	
	
}
