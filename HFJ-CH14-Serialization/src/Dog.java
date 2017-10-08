import java.awt.Color;
import java.io.Serializable;

public class Dog implements Serializable {
	private String name;
	private Color colarColor;
	private int length;
	
	//Constructor
	public Dog(){
		name="";
		colarColor=Color.WHITE;
		length=0;
	}
	public Dog(String name, Color colar, int l){
		this.name=name;
		colarColor=colar;
		length=l;
	}
	
	//toString
	@Override
	public String toString(){
		return "Dog: \n\t" + "Name: " + name + "\n\tColar: " + colarColor +
				"\n\tLength: " + length + " cm\n";
	}
	
	public static void main(String[] args) {
		System.out.println("Main iz Dog");
	}
	
}
