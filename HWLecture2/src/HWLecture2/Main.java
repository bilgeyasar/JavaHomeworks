package HWLecture2;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses("Yazılım Geliştirici Yetiştirme Kampı","C# + Angular",20,"Engin Demiroğ");
		
		CourseManager courseManager=new CourseManager();
		courseManager.JoinToCourse(course1);
		courseManager.DeleteCourse(course1);
		
		Courses course2=new Courses("Yazılım Geliştirici Yetiştirme Kampı","Java+React",50,"EnginDemiroğ");
		courseManager.JoinToCourse(course2);
		courseManager.DeleteCourse(course2);
		
		Courses course3=new Courses("Programlamaya Giriş İçin Temel Kurs","Introduction",100,"Engin Demiroğ");
		courseManager.JoinToCourse(course3);
		courseManager.DeleteCourse(course3);
		
		Courses[] courses = {course1,course2,course3};
		System.out.println("\nCourse List:");
		for(Courses course: courses) {
			
			System.out.println(course.courseName + " " + course.courseExplanation);
		}
		
		System.out.println("----------------------------------------------------");
		
		Category category1=new Category(1,"Programlama");
		
		Category[] categories= {category1};
		
		for(Category category: categories) {
			System.out.println(category.categoryName);
		}
		
		CategoryManager categoryManager= new CategoryManager();
		categoryManager.AddCategory(category1);
		categoryManager.DeleteCategory(category1);
	}

}
