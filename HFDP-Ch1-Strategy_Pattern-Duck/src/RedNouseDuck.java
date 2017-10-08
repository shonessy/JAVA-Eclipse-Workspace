
public class RedNouseDuck extends Duck{
	public RedNouseDuck(){
		this.flyBehavior=new FlyWithWings();
		this.quackBehavior = new Squick();
	}
}
