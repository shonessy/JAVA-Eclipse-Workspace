
public class Student extends Person{
	private int numCourses;
	private String courses[];
	private int grades[];
	private static final int MAX_COURSE=30;
	
	//Constructors
	public Student(String name, String address){
		super(name, address);
		numCourses=0;
		courses=new String[MAX_COURSE];
		grades=new int[MAX_COURSE];
	}
	
	//toStrung
	@Override
	public String toString(){
		return "Student: " + super.toString();
	}
	
	//add Course and Grade
	public void addCourseGrade(String course, int grade){
		courses[numCourses]=course;
		grades[numCourses++]=grade;
		//numCourses++;
	}
	
	//printGrades
	public void printGrades(){
		for(int i=0; i<numCourses; i++)
			System.out.print(courses[i] + ": " + 
							 grades[i] + "\t\t");
		System.out.println();
	}
	
	//get average grade
	public double getAverageGrade(){
		double sum=0.0;
		for(int i=0; i<numCourses; i++)
			sum+=grades[i];
		return sum/numCourses;
	}
	
	
}
