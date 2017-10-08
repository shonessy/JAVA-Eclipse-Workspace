
public class Ojler2 {

	public static void main(String[] args) {
		int prev=1;
		int curr=2;
		int sum=2;		// suma parnih je vec 2
		int temp;
		
		while(curr<=4000000){
			temp=curr;
			curr+=prev;
			prev=temp;
			if(curr%2==0)
				sum+=curr;
			}
		System.out.println(sum);
		
	}

}
