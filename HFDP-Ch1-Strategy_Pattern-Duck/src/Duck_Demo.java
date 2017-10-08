
public class Duck_Demo {
	
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		RedNouseDuck redNouse = new RedNouseDuck();
		WoodenDuck wodden = new WoodenDuck();
		
		System.out.println("Ovo je Demo Pataka");
		System.out.println();
		
		//Mallard
		mallard.showInfo();
		mallard.fly();
		mallard.swim();
		mallard.quack();
		System.out.println();
		
		//RedNouse
		redNouse.showInfo();
		redNouse.fly();
		redNouse.swim();
		redNouse.quack();
		System.out.println();
		
		//Wooden
		wodden.showInfo();
		wodden.fly();
		wodden.swim();
		wodden.quack();
		System.out.println();
		
		//pistaljka u drvenu patku
		System.out.println("Ugradjujemo pistaljku u drvenu patku....");
		wodden.setQuackBehavior(new Whistle());
		wodden.showInfo();
		wodden.fly();
		wodden.swim();
		wodden.quack();
		System.out.println();
		
	}

}
