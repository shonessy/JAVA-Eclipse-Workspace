
public class Cube {
	private int L, W, H;
	private int volume;
	
	Cube(int a, int b, int c){
		L=a;
		W=b;
		H=c;
		volume=L*W*H;
		}
	
	int get_L(){
		return L;
		}
	int get_W(){
		return W;
		}
	int get_H(){
		return H;
		}
	
	int getVolume(){
		return volume;
	}
	
	boolean sameCube(Cube c){
		if( L==c.get_L() & W==c.get_W() & H==c.get_H() )
			return true;
		return false;
		}
	
	boolean sameVolume(Cube c){
		if( volume==c.getVolume() )
			return true;
		return false;
		}
	
}
