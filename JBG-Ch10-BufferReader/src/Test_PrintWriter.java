import java.io.PrintWriter;

public class Test_PrintWriter {

	public static void main(String[] args) {

		PrintWriter pw=new PrintWriter(System.out, false);
		System.out.println("Probamo PrintWriter: ");
		int a=7;
		double b=5.45;
		boolean c=false;
		pw.println(a);
		pw.println(b);
		pw.println(c);
	}

}
