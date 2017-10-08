import java.util.Random;

public class Test {
	public static void main(String args[]){
		Photo photo=new Photo("Letovanje", new Date(25,07,2015));
		Radio radio =new Radio();
		radio.setStation(105.7);
		Computer comp=new Computer("Dell-5749");
		
		Desk desk=new Desk(3, photo, radio, comp);
		System.out.println(desk);
		
		Paper paper_0=new Paper(1);
		System.out.println("Papir0: " + paper_0);
		System.out.println();
		
		Paper papers_1[]=new Paper[12];
		for(int i=0; i<papers_1.length; i++)
			papers_1[i]=new Paper(new Random().nextInt(3));
		System.out.println("Papiri 1: ");
		for(Paper a:papers_1)
			System.out.println(a);
		System.out.println();
		
		Paper papers_2[]=new Paper[5];
		for(int i=0; i<papers_2.length; i++)
			papers_2[i]=new Paper(new Random().nextInt(3));
		System.out.println("Papiri 2: ");
		for(Paper a:papers_2)
			System.out.println(a);
		System.out.println();
		
		desk.getDrawer(1).fillDrawer(paper_0);
		desk.getDrawer(2).fillDrawer(papers_1);
		desk.getDrawer(3).fillDrawer(papers_2);
		System.out.println(desk);
		System.out.println("Desk tidy? " + desk.isTidy());
		
		radio.turnOn();
		desk.getDrawer(2).openDrawer();
		System.out.println("Desk tidy? " + desk.isTidy());
		System.out.println(desk);
		desk.tidyUp();
		System.out.println("Desk tidy? " + desk.isTidy());
		System.out.println(desk);
		desk.getDrawer(2).emptyDrawer();
		System.out.println(desk);
		
		
		
		
	}
	
}
