package homework3;

public class StudentManager extends UserManager {
	
	public void registerTheCourse(Student student, Course course) {
		System.out.println(student.getFirstName() + "! You have successfully enrolled in the" + course.getName() + " course");
	}
	
	public void removeTheCourse(Student student, Course course) {
		System.out.println(student.getFirstName() + "! We successfully removed your chosen" + course.getName() + "course");
	}
	
	

}
