
public class Line extends Point{
	private Point end;
	
	//Constructors
	public Line(){
		super();
		end=new Point();
	}
	public Line(int beginX, int beginY, int endX, int endY){
		super(beginX, beginY);
		end=new Point(endX, endY);
	}
	public Line(Point begin, Point end){
		super(begin.getX(), begin.getY());
		this.end=end;
	}
	
	//Setters & Getters
		public void setBegin(Point begin){
			super.setX(begin.getX());
			super.setY(begin.getY());
		}
		public Point getBegin(){
			return super.getPoint();
		}
		public void setEnd(Point end){
			this.end=end;
		}
		public Point getEnd(){
			return end;
		}
		public void setBeginX(int x){
			super.setX(x);
		}
		public int getBeginX(){
			return super.getX();		//moze bez super.
		}
		public void setBeginY(int y){
			super.setY(y);
		}
		public int getBeginY(){
			return super.getY();
		}
		public void setEndX(int x){
			end.setX(x);
		}
		public int getEndX(){
			return end.getX();
		}
		public void setEndY(int y){
			end.setY(y);
		}
		public int getEndY(){
			return end.getY();
		}
		public void setBeginXY(int x, int y){
			super.setXY(x, y);
		}
		public int[] getBeginXY(){
			return super.getXY();
		}
		public void setEndXY(int x, int y){
			end.setXY(x, y);
		}
		public int[] getEndXY(){
			return end.getXY();
		}
		
		//toString
		@Override
		public String toString(){
			return "Line[begin=" + super.toString() + ", end=" + end +"]";
		}
		
		//Duzina duzi
		public double getLength(){
			return super.distance(end);
		}
}
