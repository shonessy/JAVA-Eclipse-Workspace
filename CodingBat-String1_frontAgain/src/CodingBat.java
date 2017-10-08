
public class CodingBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcXY123XYijk";
		String word="XY";
		String ret="";
		int n=0, l=str.length(), start=0;
		
		while( (n=str.indexOf(word, start)) != -1) {
			if(n==0){
		    	ret+=str.charAt(word.length());
		      	start=n+word.length();
		      	}
		    else if(n==l-word.length()){
		    	ret+=str.charAt(n-1);
		    	start=n+word.length();
		    	}
		    else if(n>0 && n<l-word.length()){
		    	ret+=str.charAt(n-1);
		    	ret+=str.charAt(n+word.length()); 
		    	start=n+word.length();
		    	}
		}
		
		System.out.println(ret);
		
	/*	for(int i=0; i<l; i++){
		n=str.indexOf(word, i);
			if(n==-1) break;
		    else if(n==0){
		    	ret+=str.charAt(word.length());
		      	i+=word.length()+2; 
		      	}
		    else if(n==l-word.length()){
		    	ret+=str.charAt(n-1);
		    	i+=word.length()+2; 
		    	}
		    else if(n>0 && n<l-word.length()){
		    	ret+=str.charAt(n-1);
		    	ret+=str.charAt(n+word.length()); 
		    	i+=word.length()+2;
		    	}

		    }*/
	
	}

}
