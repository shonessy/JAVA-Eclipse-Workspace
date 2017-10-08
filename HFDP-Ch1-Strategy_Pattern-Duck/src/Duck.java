
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior = qb;
	}
	
	public void quack(){
		quackBehavior.quack();
	}
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void swim(){
		System.out.println("I'm swimming, because all ducks do :))) ");
	}
	
	public void showInfo(){
		System.out.println("I'm: " + this.getClass().getSimpleName());
	}
}
