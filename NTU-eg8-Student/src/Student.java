import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Student {
	private String name;
	private String address;
	private int numCourses;
	private String courses[];
	private int grades[];
	private static final int MAX_COURSES=30;
	
	//Constructors
	public Student(String name, String address){
		this.name=name;
		this.address=address;
		numCourses=0;
		courses=new String[MAX_COURSES];
		grades=new int[MAX_COURSES];
	}
	
	//Setters & Getters
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	
	//toString
	public String toString(){
		return name + " (" + address + ")";
	}
	
	//Dodati kurs i ocjenu
	public void addCourseGrade(String course, int grade){
		this.courses[numCourses]=course;
		this.grades[numCourses]=grade;
		numCourses++;
	}
	
	//print all grades
	public void printGrades(){
		String ret=name + "\t";
		for(int i=0; i<numCourses; i++)
			ret+=courses[i] + ":" + grades[i] + "\t";
		System.out.println(ret);
	}
	
	//average grade
	public double getAverageGrade(){
		double sum=0.0;
		for(int i=0; i<numCourses; i++)
			sum+=grades[i];
		return sum/numCourses;
	}
	
	
	
	
	
	
}
