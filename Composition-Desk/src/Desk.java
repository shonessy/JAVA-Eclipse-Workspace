
public class Desk {
	private Radio radio;
	private Photo photo;
	private Computer computer;
	private Drawer drawers[];
	
	//Constructors
	public Desk(int numOfDrawers, Photo photo, Radio radio, Computer computer){
		this.drawers=new Drawer[numOfDrawers];
		for(int i=0; i<numOfDrawers; i++)
			this.drawers[i]=new Drawer(i+1);
		this.photo=photo;
		this.radio=radio;
		this.computer=computer;
	}
	
	//Getters & Setters
	public Drawer getDrawer(int numOfDrawer){
		return drawers[numOfDrawer-1];
	}
	
	//toString
	@Override
	public String toString(){
		String ret= "\t\t\t******Desk******\n";
		for(Drawer d : drawers)
			ret+=d.toString() + "\n";
		ret+=photo.toString() + "\n";
		ret+=radio.toString() + "\n";
		ret+=computer.toString() + "\n";
		return ret+="**************************************";
	}
	
	
	//setters & getters
	public boolean isTidy(){
		if(allDrawersClosed() && !computer.isOn() && !radio.isOn() )
			return true;
		return false;
	}
	
	//tidy up the desk
	public void tidyUp(){
		closeAllDrawers();
		radio.turnOff();
		computer.turnOff();
	}
	
	//are all drawers closed
	private boolean allDrawersClosed(){
		for(Drawer d : drawers)
			if(d.isOpen())
				return false;
		return true;
	}
	
	//close all drawers
	private void closeAllDrawers(){
		for(Drawer d : drawers)
			d.closeDrawer();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
