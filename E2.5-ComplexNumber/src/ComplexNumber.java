
public class ComplexNumber {
	private double x,y;
	
	public ComplexNumber(double real, double imag){
		x=real;
		y=imag;
		}
	
	public double getReal(){
		return x;
		}
	
	public double getImag(){
		return y;
		}
	
	public double mod(){
		return Math.sqrt(x*x+y*y);
		}
	
	// override
	public String toString(){
		return "[ " + x + " + " + y + "i ]";
		}
	
	public ComplexNumber add(ComplexNumber a){
		return new ComplexNumber(x+a.x, y+a.y);
		}
	
	public static ComplexNumber add(ComplexNumber a, ComplexNumber b){
		return new ComplexNumber(a.x+ b.x, a.y+b.y);
		}
	
	public ComplexNumber mult(ComplexNumber a){
		return new ComplexNumber(x*a.x-y*a.y, x*a.y+y*a.x);
		}
	
	public static ComplexNumber mult(ComplexNumber a, ComplexNumber b){
		return new ComplexNumber(a.x*b.x-a.y*b.y, a.x*b.y+a.y*b.x);
		}
	
	
	
	

}
