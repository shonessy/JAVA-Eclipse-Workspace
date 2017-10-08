
public class MovableRectangle implements Movable{
	MovablePoint bottomLeft;
	MovablePoint topRight;
	
	//Constructoes
	public MovableRectangle(int x1, int y1, 
							int x2, int y2,
							int xSpeed, int ySpeed){
		bottomLeft=new MovablePoint(x1, y1, xSpeed, ySpeed);
		topRight=new MovablePoint(x2, y2, xSpeed, ySpeed);
	}
	
	//toSttring
	@Override
	public String toString(){
		return "Rectangle: A is " + bottomLeft + 
				"\n\t   B is " + topRight;
	}
	
	//move up
	@Override
	public void moveUp(){
		bottomLeft.moveUp();
		topRight.moveUp();
	}
	
	//move down
	@Override
	public void moveDown(){
		bottomLeft.moveDown();
		topRight.moveDown();
	}
	
	//move left
	@Override
	public void moveLeft(){
		bottomLeft.moveLeft();
		topRight.moveLeft();
	}
	
	//move right
	@Override
	public void moveRight(){
		bottomLeft.moveRight();
		topRight.moveRight();
	}
	
	//Area
	public int getArea(){
		return (topRight.x - bottomLeft.x) *
			   (topRight.y - bottomLeft.y);
	}
	
	//Perimeter
	public int getPerimeter(){
		return 2*(
				  (topRight.x - bottomLeft.x) + 
				  (topRight.y - bottomLeft.y)
				  );
				
	}
	
	
	
	
}
