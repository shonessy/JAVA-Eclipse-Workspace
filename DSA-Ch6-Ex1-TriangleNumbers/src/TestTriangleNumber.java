/*
 * find Nth triangle number
 */

import java.util.Scanner;

public class TestTriangleNumber {


	//------------------------------------------------//
	//triangle
	public int triangle(int n) {
		if(n==1)
			return 1;
		return n + triangle(n-1);
	}
	//------------------------------------------------//
	//factorial
	public int factorial(int n){
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	//------------------------------------------------//
	//pow
	public int pow(int x, int e) {
		if(e==1)
			return x;
		return x*pow(x, e-1);
	}
	//------------------------------------------------//
	//main
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int num=input.nextInt();
		System.out.println(num + "th triangle number: " + 
						   new TestTriangleNumber().triangle(num));
		System.out.println(num + "th factorial number: " + 
				   		   new TestTriangleNumber().factorial(num));
		System.out.println("5^" + num + "= " + 
				   		    new TestTriangleNumber().pow(5, num));
		

	}
	//------------------------------------------------//
}
