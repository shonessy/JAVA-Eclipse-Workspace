
public class Vehicle {
	private int passengers;
	private int fuelCap;
	private int consumption;
	
	Vehicle(){
		passengers=fuelCap=consumption=0;
		}
				
	Vehicle(int p, int f, int c){
		passengers=p;
		fuelCap=f;
		consumption=c;
		}
	
	double range(){
		return (double)fuelCap/consumption*100;
		}
	
	double fuelNeeded(int km){
		return (double) km*consumption/100;
		}
	
	//getters and setters
	int  getPassengers(){return passengers;}
	void setPassengers(int a){ passengers=a;}
	
	int  getFuelCap(){ return fuelCap;}
	void setFuelCap(int a){ fuelCap=a;}
	
	int  getConsumption(){return consumption;}
	void setConsumption(int a){ consumption=a;}
	
	
}
