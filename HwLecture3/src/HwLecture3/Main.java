package HwLecture3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1= new Instructor(1, "Engin", "Demiroğ", "engin@gmail.com", "Java");
		
		Student student1= new Student(1,"Bilge","Yaşar","bilge@gmail.com","Java");		
		
		
		Student student2=new Student();
		student2.setSignedCourses("C#");
		student2.setFirstName("Seyda");
		student2.setLastName("Güney");
		student2.setId(2);
		student2.setEmail("seyda@gmail.com");
		
		
		
		UserManager userManager =new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		User[] users= {student1,student2,instructor1};
		userManager.addUser(student1);
		userManager.infoUser(student1);
		
		studentManager.signCourse(student2);
		userManager.infoUser(student2);
		
		instructorManager.givenCourses(instructor1);
	}

}
