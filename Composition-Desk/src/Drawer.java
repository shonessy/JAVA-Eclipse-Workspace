
public class Drawer {
	public static final int MAX_NUM_OF_PAPERS=30;

	private int drawerNum;
	private boolean isOpen;
	private boolean isFilled;
	private Paper papers[]=new Paper[MAX_NUM_OF_PAPERS];
	private int numOfPapersIn;
	
	//Constructors
	public Drawer(int drawerNum){
		this.drawerNum=drawerNum;
		numOfPapersIn=0;
		isOpen=false;
		isFilled=false;
	}
	public Drawer(int drawerNum, Paper paper){
		this.drawerNum=drawerNum;
		papers[numOfPapersIn]=paper;
		isOpen=false;
		isFilled=true;
	}
	public Drawer(int drawerNum, Paper papers[]){
		this.drawerNum=drawerNum;
		numOfPapersIn=papers.length;
		for(int i=0; i<numOfPapersIn; i++)
			this.papers[i]=papers[i];
		isOpen=false;
		isFilled=true;
	}
	public Drawer(int drawerNum, Paper paper, boolean isOpened){
		this.drawerNum=drawerNum;
		papers[numOfPapersIn]=paper;
		this.isOpen=isOpened;
		this.isFilled=true;
	}
	
	//Setters & Getters
	public boolean isOpen(){
		return this.isOpen;
	}
	public boolean isFilled(){
		return this.isFilled;
	}
	public String getPapers(){
		String ret="";
		if(isFilled)
			for(int i=0; i<numOfPapersIn ; i++)
				ret+="\t\t" + papers[i] + "\n";
		return ret;
	}
	
	//toString
	@Override
	public String toString(){
		return "Drawer no." + drawerNum + 
				" is " + ( isOpen ? "Opened" : "Closed" ) +
				" and " + ( isFilled ? ("Filled with:\n" + getPapers()): "Empty" ); 		
	}
	
	//Open and Close Drawer
	public void openDrawer(){
		this.isOpen=true;
	}
	public void closeDrawer(){
		this.isOpen=false;
	}
	
	//Empty or Fill Drawer 
	public void emptyDrawer(){
		papers=new Paper[MAX_NUM_OF_PAPERS];
		isFilled=false;
	}
	public void fillDrawer(Paper paper){
		if(numOfPapersIn<MAX_NUM_OF_PAPERS){
			papers[numOfPapersIn++]=paper;
			isFilled=true;
		}
		else
			System.out.println("Can't add " + paper + " -Drawer is Full");
	}
	public void fillDrawer(Paper papers[]){
		for(int i=0; i<papers.length && i<MAX_NUM_OF_PAPERS; i++){
			if(numOfPapersIn<MAX_NUM_OF_PAPERS){
				this.papers[numOfPapersIn++]=papers[i];
				isFilled=true;
			}
			else
				System.out.println("Can't add " + papers[i] + " - Drawer is Full");
		}
			
	}
}
