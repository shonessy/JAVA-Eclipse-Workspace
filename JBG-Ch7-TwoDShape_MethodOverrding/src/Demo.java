
public class Demo {

	public static void main(String[] args) {
		TwoDShape shapes[]=new TwoDShape[5];				//mozemo kreirati promjenjivu abstraktnog tipa
		
		shapes[0] = new Triangle(8,12,"Outlined");
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7);
		//shapes[4] = new TwoDShape(10, 20, "generic");		//ne mozemo kreirati (deklarisati) objekat
		shapes[4] = new Circle(10);
		
		for(int i=0;i<shapes.length;i++){
			System.out.println("Object is : " + shapes[i].getName());
			shapes[i].showDim();
			System.out.println("Area is: " + shapes[i].area() + "\n");	
		}

	}

}
