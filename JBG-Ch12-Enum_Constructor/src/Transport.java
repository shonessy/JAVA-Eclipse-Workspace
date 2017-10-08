
public enum Transport {
	CAR(120, 220), 
	TRUCK (70, 90),
	AIRPLANE(800, 1_200),
	TRAIN(90, 110),
	BOAT(45, 70);
	private int typSpeed;
	private int maxSpeed;
	
	//Constructor
	Transport(int typSpeed, int maxSpeed){
		this.typSpeed=typSpeed;
		this.maxSpeed=maxSpeed;
	}
	
	//getSpeed
	public int getTypSpeed(){
		return typSpeed;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	//toString
	@Override
	public String toString(){
		return super.toString() + ": Typical speed: " + 
				typSpeed + " km/h; Maximal speed: " + 
				maxSpeed + " km/h";
	}
}
