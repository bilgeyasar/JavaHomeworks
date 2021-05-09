package ECommerceProject.core.concretes;

import ECommerceProject.core.abstracts.EmailService;
import ECommerceProject.entities.concretes.User;


public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Your verification e-mail has been sent to your address: " + user.getEmail());
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("Click on the link to verify your registration: " + user.getFirstName());
	}

	

	
	
}
