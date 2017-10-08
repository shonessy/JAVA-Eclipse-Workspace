
public class Averager {
	private int n;
	private double sum=0.0, sumOfSquares=0.0;
	
	public int getNum(){
		return n;
		}
	
	public double getSum(){
		return sum;
		}
	
	public double getSumOfSquares(){
		return sumOfSquares;
		}
	
	public void addData(double x){
		n++;
		sum+=x;
		sumOfSquares+=x*x;
		}
	
	public double getAverage(){
		return sum/n;
		}
	
	public double getStDerivation(){
		return Math.sqrt((sumOfSquares-sum*sum/n)/n);	
		}
	
	public void reset(){
		n=0;
		sum=0.0;
		sumOfSquares=0.0;
		}
	
	public static class AveragerTest{
		public static void main(String[] args){
			Averager a=new Averager();
			for(int i=1;i<=5;i++)
				a.addData(i);
			System.out.println("n: " + a.getNum());
			System.out.println("Sum: " + a.getSum());
			System.out.println("Sum(X^2): " + a.getSumOfSquares());
			System.out.println("Average: " + a.getAverage());
			System.out.println("Standard Deviation: " + a.getStDerivation());
			
			}
		
		
		}
	
	
	
	
}
