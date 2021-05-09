package ECommerceProject.business.abstracts;

import ECommerceProject.entities.concretes.User;

public interface UserService {
	//Kullanıcının sistemde yapabileceği işlemler.
	void login(String email,String password);   //Kullanıcı sisteme giriş yapabilir(e-posta ve şifreyle)
	void register(User user); //Kullanıcı sisteme kaydolabilir(Doğrulamaları geçerse)
	void registerGoogle();

	
}
