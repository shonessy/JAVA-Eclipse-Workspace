import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("max", Color.BLUE, 74);
		Cat cat1 = new Cat("Masa", Color.red, 25);
		
		System.out.println("Serializovani: \n");
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(cat1);
		System.out.println("***********************************\n");
		
		
		/*
		 * **********serialization**********
		 */
		try(FileOutputStream fos=new FileOutputStream("C:/Users/Kucni/Desktop/"
													+ "SerializedAnimals.ser");
			ObjectOutputStream oos =new ObjectOutputStream(fos); )
		{
			oos.writeObject(dog1);
			oos.writeObject(dog2);
			oos.writeObject(cat1);
		}catch(IOException e){
			System.out.println("Can't save object to .ser file");
		}
		
		
		/*
		 * ********deserialization***********
		 */
		Dog d1 = null;
		Dog d2 = null;
		Cat c1 = null;
		
		try( FileInputStream fis=new FileInputStream("C:/Users/Kucni/Desktop/"
											  	   + "SerializedAnimals.ser");
			 ObjectInputStream ois=new ObjectInputStream(fis); )
		{
			d1 = (Dog) ois.readObject();
			d2 = (Dog) ois.readObject();
			c1 = (Cat) ois.readObject();
		}catch(IOException e){
			System.out.println("Can't open objects .ser file");
		}catch(ClassNotFoundException e){
			System.out.println("Can't find class");
		}
		
		//main
		System.out.println("Deserializovani: \n");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println("***********************************\n");
	}

}
