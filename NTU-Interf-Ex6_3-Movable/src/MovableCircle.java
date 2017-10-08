
public class MovableCircle implements Movable{
	private MovablePoint center;
	private int radius;
	
	//Constructos
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
		center =new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius=radius;
	}
	
	//tosTring
	@Override
	public String toString(){
		return "Movable Circle: radius=" + radius +
		", center is " + center;
	}
	
	//move up
	@Override
	public void moveUp(){
		center.moveUp();
	}
	
	//move down
	@Override
	public void moveDown(){
		center.moveDown();
	}
	
	//move left
	@Override
	public void moveLeft(){
		center.moveLeft();
	}
	
	//move right
	@Override
	public void moveRight(){
		center.moveRight();
	}
	
	
	
	
	
	
	
}
