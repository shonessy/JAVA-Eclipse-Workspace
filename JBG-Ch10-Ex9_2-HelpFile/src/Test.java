
public class Test {
	public static final String fileName="HelpFile.txt";
	
	public static void main(String[] args) {
		HelpFile help1=new HelpFile(fileName);
		String topic;
		System.out.println("Unesite temu za pretragu, 'stop' za prekid: ");

		while( !(topic=help1.getSelection()).equals("stop")){
		if(!help1.helpOn(topic))
			System.out.println("Neuspesna pretraga\n");
		}
		System.out.println("Kraj pretrage");
		
	}

}