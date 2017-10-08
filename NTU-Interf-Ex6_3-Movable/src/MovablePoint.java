
public class MovablePoint implements Movable{
	int x,			//default-package
		y,
		xSpeed,
		ySpeed;
	
	//Constructors
	public MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	
	//toStrign
	@Override
	public String toString(){
		return "MovablePoint[x=" + x +
				", y=" + y +
				", xSpeed=" + xSpeed +
				", ySpeed=" + ySpeed + "]";			
	}
	
	//move up
	@Override
	public void moveUp(){
		y+=ySpeed;
	}
	
	//move down
	@Override
	public void moveDown(){
		y-=ySpeed;
	}
	
	//move left
	@Override
	public void moveLeft(){
		x-=xSpeed;
	}
	
	//move right
	@Override
	public void moveRight(){
		x+=xSpeed;
	}
	
	
	
	
	
}
