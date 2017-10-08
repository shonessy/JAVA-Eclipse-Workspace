
public class DelimiterTest {

	public static void main(String[] args) {
		String s[] = new String[4];
		s[0] = "2*(x+5) + 7*(4-3*x)";
		s[1] = "(ad[fads]dfas{fdas}fa)";
		s[2] = "{fdasfa]afdas(fasdF)";
		s[3] = "(fasdfasd(fdasfas{fasd}asdf[fdas])";
		
		for(String x : s){
			System.out.println(x + ": ");
			new BracketChecker().check(x);
		}

	}

}
