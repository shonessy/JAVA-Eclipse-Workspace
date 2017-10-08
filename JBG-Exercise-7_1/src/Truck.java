
public class Truck extends Vehicle{
	private int cargoCap;
	
	Truck(){
		super();
		cargoCap=0;
		}

	Truck(int p, int f, int c, int cap){
		super(p,f,c);
		cargoCap=cap;
		}
	
	//konstruktor kopije
	Truck(Truck t){
		super(t.getPassengers(), t.getFuelCap(), t.getConsumption());
		cargoCap=t.cargoCap;
		}
	
	int getCargoCap(){
		return cargoCap;
		}
	void setCargoCap(int p){
		cargoCap=p;
		}
}
