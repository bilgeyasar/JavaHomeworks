package HwLecture3;

public class Instructor extends User {

	String givenCourse;
	
	public Instructor(int id,String firstName,String lastName,String email,String givenCourse) {
		super(id, firstName, lastName, email);
		this.givenCourse=givenCourse;
	}
}
