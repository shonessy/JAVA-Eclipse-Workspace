
public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student("Marko Jovanovic", "Drvarska 30");
		System.out.println(s1);
		
		s1.addCourseGrade("Java", 9);
		s1.addCourseGrade("C++", 10);
		s1.addCourseGrade("VHDL", 7);
		s1.printGrades();
		
		System.out.printf("Prosjecna ocjena: %.2f\n", s1.getAverageGrade());
	}

}
