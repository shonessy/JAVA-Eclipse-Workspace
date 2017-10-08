
public class Computer {
	private String brandName;
	private boolean isOn;
	
	//Constructors
	public Computer(){
		brandName="No name";
		isOn=false;
	}
	public Computer(String brandName){
		this.brandName=brandName;
		isOn=false;
	}
	
	//Setters & Getters
	public String getBrandName(){
		return brandName;
	}
	public boolean isOn(){
		return isOn;
	}
	
	//toSTring
	@Override
	public String toString(){
		return "Computer[brand:" + brandName +
				", state: " + (isOn ? "On]" : "Off]");
	}
	
	//turon on
	public void turnOn(){
		if(!isOn)
			isOn=true;
		else
			System.out.println("Kompjuter je vec ukljucen");
	}
	
	//turn Off
	public void turnOff(){
		if(isOn)
			isOn=false;
		else
			System.out.println("Kompjuter je vec iskljucen");
	}
	
	
	
	
	
	
}
