
public class Polynomial {
	private double coeffs[];
	
	//Constructors
	public Polynomial(double ...coefs){
		this.coeffs=invertCoeffs(coefs);
	}
	
	//stepen polinoma
	public int getDegree(){
		return coeffs.length-1;
	}
	
	//toString
	public String toString(){
		String ret="";
		for(int i=coeffs.length-1; i>=0; i--){
			if(coeffs[i]!=0){
				ret+=coeffs[i]; 
				if(i!=0)
					ret+= "x^" + i + " + ";
			}
		}
		return ret;
	}
	
	//EVALUATE
	public double evaluate(double x){
		double sum=0;
		for(int i=coeffs.length-1; i>=0; i--)
			sum+=coeffs[i]*Math.pow(x, i);
		return sum;
	}
	
	//add
	public Polynomial add(Polynomial right){
		double sum[]=new double[Math.max(coeffs.length, right.coeffs.length)];
		for(int i=0; i<Math.min(coeffs.length, right.coeffs.length); i++)
			sum[i]=coeffs[i]+right.coeffs[i];
		
		if(this.coeffs.length>right.coeffs.length)
			for(int i=Math.min(coeffs.length, right.coeffs.length); i<this.coeffs.length; i++)
				sum[i]+=this.coeffs[i];
		
		else if(right.coeffs.length>this.coeffs.length)
			for(int i=Math.min(coeffs.length, right.coeffs.length); i<right.coeffs.length; i++)
				sum[i]+=right.coeffs[i];
		
		coeffs=sum;
		return this;
	}
	
	//multiply
	public Polynomial multiply(Polynomial right){
		double prod[]=new double[this.getDegree()*right.getDegree()+1];
		int prodInd=0;
		for(int i=0; i<right.coeffs.length;i++){
			prodInd=i;
			for(int j=0; j<this.coeffs.length; j++)
				prod[prodInd++]+=right.coeffs[i]*this.coeffs[j];
		}
		this.coeffs=prod;
		return this;
	}
	 
	
	//ivertCoeffs 
	private double[] invertCoeffs(double coeffs[]){
		double temp;
		for(int i=0; i<coeffs.length/2; i++){
			temp=coeffs[i];
			coeffs[i]=coeffs[coeffs.length-1-i];
			coeffs[coeffs.length-1-i]=temp;
		}
		return coeffs;
	}
	
}
