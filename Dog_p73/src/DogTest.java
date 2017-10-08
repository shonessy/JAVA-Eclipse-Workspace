
public class DogTest {

	public static void main(String[] args) {
		Dog psi[]=new Dog[3];
		psi[0]=new Dog();
		psi[1]=new Dog();
		psi[2]=new Dog();
		
		psi[0].size=15;
		psi[1].size=75;
		psi[2].size=23;
		
		for(int i=0;i<psi.length;i++)
			psi[i].bark();

	}

}
