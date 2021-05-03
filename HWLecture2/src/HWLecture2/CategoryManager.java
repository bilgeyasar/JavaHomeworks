package HWLecture2;

public class CategoryManager {

	public void AddCategory(Category category) {
		System.out.println("Category Added! " + category.categoryName + category.categoryId);
	}
	
	public void DeleteCategory(Category category) {
		System.out.println("Category Deleted! ");
	}
}
