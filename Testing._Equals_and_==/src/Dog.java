
public class Dog {
	String name;
	String breed;
	
	//Constructors
	public Dog(){
		name="No name";
		breed="Dzukela";
	}
	public Dog(String name, String breed){
		this.name=name;
		this.breed=breed;
	}
	public Dog(Dog another){
		this.name=another.name;
		this.breed=another.breed;
	}
	
	//toSTring
	@Override
	public String toString(){
		return "Pas[" + name + ", " + breed + "]";
	}
	
	//equals
	//@Override
	public boolean equals(Dog another){
		if(this.name==another.name && this.breed==another.breed)
			return true;
		return false;
	}
	
	//Bark
	public void bark(){
		System.out.println("Av, av, avvvav");
	}

}
