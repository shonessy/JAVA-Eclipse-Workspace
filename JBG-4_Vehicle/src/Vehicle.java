
public class Vehicle {
	private int passengers;
	private int fuelCap;
	private int consumption;
	
	Vehicle(int p, int f, int c){
		passengers=p;
		fuelCap=f;
		consumption=c;
		}
	
	int range(){
		return consumption*fuelCap;
	}
	
	double fuelNeeded(int km){
		return (double) km/consumption;
	}
	
	
}
