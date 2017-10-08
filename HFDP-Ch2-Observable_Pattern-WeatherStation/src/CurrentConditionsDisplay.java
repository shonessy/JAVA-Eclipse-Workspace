
public class CurrentConditionsDisplay implements Observer, Display{
	private double temperature;
	private double humidity;
	private double pressure;
	private Subject weatherStation;
	
	public CurrentConditionsDisplay(Subject ws){
		this.weatherStation = ws;
		this.weatherStation.registerObserver(this);
	}
	
	public void update(double temperature, double humidity, double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;	
		this.display();
	}
	
	public void display(){
		System.out.println("Display: " + this.getClass().getSimpleName()
						   + "\nTeperature: "  + this.temperature + " C"
						   + "\nHumidity: " + this.humidity + " %"
						   + "\nPressure: " + this.pressure + " Pa"
						   + "\nHeat Index: " + this.computeHeatIndex(this.temperature, this.humidity)
						   + "\n\n");
		
	}
	
	
}
