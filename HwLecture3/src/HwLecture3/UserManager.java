package HwLecture3;

public class UserManager {

	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added to the system.");
	}
	
	public void infoUser(User user) {
		System.out.println("First name: " + user.getFirstName() + " Last name: " + user.getLastName() + " Email: " + user.getEmail());
	}
}
