import java.util.Random;

public class Radio {
	private double station;	//88-108 MHz
	private boolean isOn;
	
	//Constructors
	public Radio(){
		station=88.0;
		isOn=false;
	}
	
	//toString
	@Override
	public String toString(){
		return String.format("Radio[%.1f MHz, " + 
						(isOn ? "On]" : "Off]"),station);
	}
	
	//Setters & Getters
	public void setStation(double station){
		this.station=station;
	}
	public double getStation(){
		return this.station;
	}
	public boolean isOn(){
		return this.isOn;
	}
	
	//turn on/off
	public void turnOn(){
		this.isOn=true;
	}
	public void turnOff(){
		this.isOn=false;
	}
	
	//search next/previus stations
	public void searchNextStation(){
		this.station+=10*(new Random().nextDouble());
		if(this.station>108.0)
			this.station=88.0+10*(new Random().nextDouble());
	}
	public void searchPreviousStation(){
		this.station-=10*(new Random().nextDouble());
		if(this.station<88.0)
			this.station=108-10*(new Random().nextDouble());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
