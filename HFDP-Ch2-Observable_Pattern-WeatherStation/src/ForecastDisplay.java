
public class ForecastDisplay implements Observer, Display{
	private Subject weatherStation;
	
	public ForecastDisplay(Subject weatherData){
		this.weatherStation = weatherData;
		this.weatherStation.registerObserver(this);
	}
	
	public void update(double temperature, double humidity, double pressure){
		this.display();
	}
	
	public void display(){
		System.out.println("Display: " + this.getClass().getSimpleName()
							+ "\nPrognoza: Bice lijepo vrijeme" 
							+ "\n\n");
	}
	
}
	