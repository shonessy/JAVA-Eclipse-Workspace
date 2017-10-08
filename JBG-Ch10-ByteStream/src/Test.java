import java.io.IOException;

public class Test {
	
	
	public static void main(String[] args)
						throws IOException{
		// TODO Auto-generated method stub
		/*byte b[]=new byte[5];
		System.out.println("Unesi bajt: ");
		int n=System.in.read();
		char c=(char)n;
		System.out.println("Kao int : " + n);
		System.out.println("Kao char: " + c);
		System.out.println("----------------\n");
		
		System.out.println("Unesite niz: ");
		//int br_proc=System.in.read(b);
		System.in.read(b);
		//System.out.println("Brocitanih bajtova: " + 
		//					br_proc);
		System.out.println("Kao bajtovi: ");
		for(byte x : b)
			System.out.print((int)x + ", ");
		System.out.println("\nKao charovi: ");
		for(byte x : b)
			System.out.print((char)x + ", ");
		*/
		byte data[]=new byte[5];
		System.out.println("Unesite do 5 karaktera");
		int n=System.in.read(data);
		//long skp=System.in.skip(Integer.MAX_VALUE);
		/*System.out.println("Uneli ste " + n + 
							" bajtova "
							+ "a preskocili " +skp);*/
		for(int i=0; i<data.length; i++)
			System.out.print((char) data[i]);
		
		System.out.println("\nUnesi jedan karakter");
		char c=(char)System.in.read();
		//System.in.skip(Integer.MAX_VALUE);	//'flush'
		System.out.println("Uneli ste: " + c);
		
		System.out.println("Unesite do 5 karaktera");
		data=new byte[5];	//ocisti prijemnik
		n=System.in.read(data);
		//skp=System.in.skip(Integer.MAX_VALUE);
		/*System.out.println("Uneli ste " + n + 
							" bajtova "
							+ "a preskocili " +skp);*/
		for(int i=0; i<data.length; i++)
			System.out.print((char) data[i] );
	}
	

}
