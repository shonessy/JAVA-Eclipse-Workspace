
public class Rect {
	public int x1,x2,y1,y2;
	
	public Rect(int a1,int b1,int a2,int b2){
		x1=a1;
		y1=b1;
		x2=a2;
		y2=b2;
		}
	
	public Rect(int width, int height){
		x1=0;
		y1=0;
		x2=width;
		y2=height;
		}
	
	public Rect(){
		x1=0;
		y1=0;
		x2=0;
		y2=0;
		}
	
	public void move(int dx, int dy){
		x1+=dx;
		x2+=dx;
		y1+=dy;
		y2+=dy;
		}
	
	public boolean isInside(int a, int b){
		return ((a>x1)&&(a<x2)&&(b>y1)&&(b<y2));
		}
	
	public Rect union(Rect r){
		int a1=(x1<r.x1)? x1:r.x1;
		int a2=(x2>r.x2)? x2:r.x2;
		int b1=(y1<r.y1)? y1:r.y1;
		int b2=(y2>r.y2)? y2:r.y2;
		return new Rect(a1,b1,a2,b2);
		}
	
	public Rect intersection(Rect r){
		int a1=(x1>r.x1)? x1:r.x1;
		int a2=(x2<r.x2)? x2:r.x2;
		int b1=(y1>r.y1)? y1:r.y1;
		int b2=(y2<r.y2)? y2:r.y2;
		Rect A= new Rect(a1,b1,a2,b2);
		if(A.x1>A.x2)
			A.x1=A.x2=0;
		if(A.y1>A.y2)
			A.y1=A.y2=0;
		return A;
		}
	
	public String toString(){
		return "[("+x1+","+y1+");("+x2+","+y2+")]";
	}
}
