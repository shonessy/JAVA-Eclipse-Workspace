
public class Teacher extends Person {
	private int numCourses;
	private String courses[];
	private static final int MAX_CURSES=5;
	
	//Constructors
	public Teacher(String name, String address){
		super(name, address);
		numCourses=0;
		courses=new String[MAX_CURSES];
	}
	
	//toString
	@Override
	public String toString(){
		return "Teacher: " + super.toString();
	}
	
	//add course
	public boolean addCourse(String course){
		for(int i=0; i<numCourses; i++)
			if(courses[i].equals(course))
				return false;
		courses[numCourses++]=course;
		return true;
	}
	
	//remove course
	public boolean removeCourse(String course){
		for(int i=0; i<numCourses; i++){
			if(courses[i].equals(course)){
				for(int j=i+1; j<numCourses; j++)
					courses[i++]=courses[j];
				numCourses--;
				return true;
			}
		}
		return false;
	}
	
	//print courses
	public void printCourses(){
		for(int i=0; i<numCourses; i++)
			System.out.print(courses[i] + "\t");
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
