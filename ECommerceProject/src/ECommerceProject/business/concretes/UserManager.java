package ECommerceProject.business.concretes;

import ECommerceProject.business.abstracts.LoginService;
import ECommerceProject.business.abstracts.UserService;
import ECommerceProject.core.abstracts.GoogleService;
import ECommerceProject.entities.concretes.User;

public class UserManager implements UserService{

	//LoginService'e bağımlıyız doğrulanırsa dediğimiz için.
	private LoginService loginService;
	
	//başkasının yazdığını almak için kendi yazdığım
	private GoogleService googleService;
	
	
	public UserManager(LoginService loginService,GoogleService googleService) {
		
		this.loginService = loginService;
		this.googleService=googleService;
		
	}

	@Override
	public void login(String email, String password) {  //Doğrulamaları sağlarsa giriş gerçekleştirilir.
		loginService.login(email, password);
		
	}

	@Override
	public void register(User user) {  //Doğrulamalar sağlanırsa kayıt gerçekleştirilir.
		loginService.register(user);
		
	}

	@Override
	public void registerGoogle() {
		googleService.registerToSystem();
		
	}
	
}
