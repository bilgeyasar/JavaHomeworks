package HwLecture3;

public class InstructorManager {
	
	public void givenCourses(Instructor instructor) {
		System.out.println("Instructor of: " + instructor.getFirstName() + " " + instructor.getLastName() + " has this course: " + instructor.givenCourse);
	}
}
