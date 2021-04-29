package homework3;

public class InstructorManager {
	public void openCourse(Course course) {
		System.out.println("Your " + course.getName() + " course has been opened.");
	}
	
	public void closeCourse(Course course) {
		System.out.println("Your " + course.getName() + " course has been closed.");
	}
}
