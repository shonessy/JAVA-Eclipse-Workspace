import java.util.ArrayList;

public class WeatherStation implements Subject{
	private double temperature;
	private double humidity;
	private double pressure;
	private ArrayList<Observer> observers;
	
	public WeatherStation(){
		this.observers = new ArrayList<Observer>();		
	}
	
	public void registerObserver(Observer o){
		this.observers.add(o);		
	}
	
	public void removeObserver(Observer o){
		int index = this.observers.indexOf(o);
		if(index != -1)
			this.observers.remove(index);
	}
	
	public void notifyObservers(){
		for(int i=0; i<this.observers.size(); i++)
			this.observers.get(i).update(this.temperature, this.humidity, this.pressure);
	}
	
	public void measurementsChanged(){
		this.notifyObservers();
	}
	
	public void setMeasurements(double t, double h, double p){
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		this.measurementsChanged();
	}
}
