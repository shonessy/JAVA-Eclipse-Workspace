import java.awt.Color;
import java.io.Serializable;

public class Cat implements Serializable{
	private String name;
	transient private Color colarColor;
	transient private int length;
	
	//Constructor
	public Cat(){
		name="";
		colarColor=Color.WHITE;
		length=0;
	}
	public Cat(String name, Color colar, int l){
		this.name=name;
		colarColor=colar;
		length=l;
	}
	
	//toString
	@Override
	public String toString(){
		return "Cat: \n\t" + "Name: " + name + "\n\tColar: " + colarColor +
				"\n\tLength: " + length + " cm\n";
	}
	
	public static void main(String[] args) {
		System.out.println("Main iz Cat");
	}
	
}