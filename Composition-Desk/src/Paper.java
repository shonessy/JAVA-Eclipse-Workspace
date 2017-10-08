
public class Paper {
	private static String type[]={"Exam", "Article","Memo" };
	private static int numOfPaper[]={1,1,1};
	private String paperName;
	
	//Constructors
	public Paper(int typeIndex){
		paperName=type[typeIndex] + 
				 (numOfPaper[typeIndex]++);
	}
	
	//Setters & Getters
	public String getPaperName(){
		return paperName;
	}
	
	//toString
	@Override
	public String toString(){
		return "Paper " + paperName ;
	}
	
	
	
}
