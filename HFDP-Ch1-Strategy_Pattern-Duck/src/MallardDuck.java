
public class MallardDuck extends Duck {
	public MallardDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
}
