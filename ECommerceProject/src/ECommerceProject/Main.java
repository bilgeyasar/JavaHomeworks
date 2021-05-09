package ECommerceProject;

import ECommerceProject.business.abstracts.UserService;
import ECommerceProject.business.concretes.LoginManager;
import ECommerceProject.business.concretes.UserManager;
import ECommerceProject.core.GoogleManagerAdapter;
import ECommerceProject.core.concretes.CheckManager;
import ECommerceProject.core.concretes.EmailManager;
import ECommerceProject.dataAccess.concretes.InMemoryUserDao;
import ECommerceProject.entities.concretes.User;

public class Main {



	public static void main(String[] args) {
				
		UserService userService=new UserManager(new LoginManager(new InMemoryUserDao(), new CheckManager(), new EmailManager()), 
				new GoogleManagerAdapter());
		
		User user1= new User(1,"bilge","yasar","bilge@gmail.com","123456");
		userService.register(user1);
		userService.login("bilge@gmail.com", "123456");
		
		System.out.println("Google simulation.");
		userService.registerGoogle();
		
		System.out.println("---------------------------------------");
		
		//e-mail ve şifre aynı girip deneyelim
		User user2= new User(1,"bilge","yasar","bilge@gmail.com","123456");
		userService.register(user2);

		
		
		
		
	
		
		

	}

}
