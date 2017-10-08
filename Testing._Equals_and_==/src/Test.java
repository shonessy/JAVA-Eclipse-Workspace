
public class Test {
	public static void main(String args[]){
		String s1="Zdravo";
		String s2="Zdravo";
		String s3="Zdravi";
		String s4=s1;
		String s5=new String(s1);
		
		Dog d0_1=new Dog();
		Dog d0_2=new Dog();
		
		Dog d1_1=new Dog("Dzek", "Vucjak");
		Dog d1_2=new Dog("Dzek", "Vucjak");
		Dog d1_3=new Dog("Ziza", "Labrador");
		Dog d1_4=d1_1;
		Dog d1_5=new Dog(d1_1);
		
		System.out.println("S1==S2: " + (s1==s2));
		System.out.println("S1.equals(S2): " + s1.equals(s2));
		s2+=s2;
		System.out.println("S1==S2: " + (s1==s2));
		System.out.println("S1.equals(S2): " + s1.equals(s2));
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		
		System.out.println("S1==S3: " + (s1==s3));
		System.out.println("S1.equals(S3): " + s1.equals(s3));
		
		System.out.println("S1==S4: " + (s1==s4));
		System.out.println("S1.equals(S4): " + s1.equals(s4));
		
		System.out.println("S1==S5: " + (s1==s5));
		System.out.println("S1.equals(S5): " + s1.equals(s5));
		System.out.println();
		
		System.out.println("D1==D2: " + (d0_1==d0_2));
		System.out.println("D0_1.equals(D0_2): " + d0_1.equals(d0_2));
		
		System.out.println("D1_1==D1_2: " + (d1_1==d1_2));
		System.out.println("D1_1.equals(D1_2): " + d1_1.equals(d1_2));
	
		System.out.println("D1_1==D1_3: " + (d1_1==d1_3));
		System.out.println("D1_1.equals(D1_3): " + d1_1.equals(d1_3));
		
		System.out.println("D1_1==D1_4: " + (d1_1==d1_4));
		System.out.println("D1_1.equals(D1_4): " + d1_1.equals(d1_4));
		
		System.out.println("D1_1==D1_5: " + (d1_1==d1_5));
		System.out.println("D1_1.equals(D1_5): " + d1_1.equals(d1_5));
	}
	
}
