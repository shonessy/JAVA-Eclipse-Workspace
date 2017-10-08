
public class WeatherStationDemo {

	public static void main(String[] args) {
		
		WeatherStation weatherStation =
				new WeatherStation();
		CurrentConditionsDisplay currentCondition =
				new CurrentConditionsDisplay(weatherStation);
		ForecastDisplay forcast =
				new ForecastDisplay(weatherStation);
		
		weatherStation.setMeasurements(25, 98, 1092);
	}

}
