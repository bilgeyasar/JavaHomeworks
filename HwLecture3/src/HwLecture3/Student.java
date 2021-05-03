package HwLecture3;

public class Student extends User {

	 String signedCourses;
	 
	 public Student() {
		 
	 }
	
	public Student(int id,String firstName,String lastName,String email,String signedCourses) {
		super(id, firstName, lastName, email);
		this.signedCourses=signedCourses;
	}
	

	public String getSignedCourses() {
		return signedCourses;
	}

	public void setSignedCourses(String signedCourses) {
		this.signedCourses = signedCourses;
	}
}
