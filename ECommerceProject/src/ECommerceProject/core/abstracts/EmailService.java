package ECommerceProject.core.abstracts;

import ECommerceProject.entities.concretes.User;

public interface EmailService {

	void sendVerifyEmail(User user);
	void clickToVerify(User user);
}
