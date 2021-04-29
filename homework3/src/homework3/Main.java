package homework3;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();	
		
		Student student = new Student();
		student.setFirstName("Oðuz");
		student.setLastName("Demirtaþ");
		userManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		userManager.update(instructor);
		
		Course introductionToSoftware  = new Course(1, "Introduction to Software");
		Course javaProgramming = new Course(2, "Java Programming");
		Course dataStructers = new Course(3, "Data Structers");
		
		
		Course[] courses = {introductionToSoftware, javaProgramming, dataStructers};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(courses);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openCourse(javaProgramming);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerTheCourse(student, javaProgramming);

	}

}
