
public class WoodenDuck extends Duck {

	public WoodenDuck(){
		this.flyBehavior = new FlyCanNot();
		this.quackBehavior = new Mute();
	}
}
