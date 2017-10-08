
public enum TraficLightColors {
	RED(5), YELLOW(2), GREEN(5);
	private int duration;
	
	//Constructor
	private TraficLightColors(int duration) {
		this.duration=duration;
	}
	
	//get light duration
	public int getDuration(){
		return duration;
	}
}
