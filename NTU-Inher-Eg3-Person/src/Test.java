
public class Test {

	public static void main(String[] args) {
		Person p1=new Person("Nepoznata Osoba", 
							 "Neznana Ulica");
		System.out.println("P1: " + p1);
		
		Student s1=new Student("Marko Jovic", 
							  "Milosa Obilica 2");
		System.out.println("S1: " + s1);
		s1.setAddress("Hercegovacka 23");
		System.out.println("S1: " + s1);
		s1.addCourseGrade("Java", 8);
		s1.addCourseGrade("C++", 7);
		s1.addCourseGrade("LabView", 10);
		System.out.printf("Prosjecna ocjena: %.2f\n", s1.getAverageGrade());
		s1.printGrades();
		
		Teacher t1=new Teacher("Radoje Cubrilo", 
							   "Moskovska 2");
		System.out.println("\nT1: " + t1);
		t1.addCourse("Java");
		t1.addCourse("C++");
		t1.addCourse("VHDL");
		t1.printCourses();
		t1.addCourse("LabView");
		t1.printCourses();
		System.out.println(t1.addCourse("C++"));
		t1.printCourses();
		System.out.println(t1.removeCourse("C++"));
		t1.printCourses();
	}

}
