package ECommerceProject.business.concretes;

import ECommerceProject.business.abstracts.LoginService;
import ECommerceProject.core.abstracts.CheckService;
import ECommerceProject.core.abstracts.EmailService;
import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class LoginManager implements LoginService {

	//CheckService'tekilerin kontrolünü yapacağız.
	//Aynı zamanda e-mail de göndereceğimiz için EmailService'e de bağlıyız.
	//UserDao da aynı şekilde.
		
	private EmailService emailService;  //register işlemleri doğrulandığında e-mail göndereceğiz.
	private CheckService checkService;  //Kontrolleri sağlamak için.
	private UserDao userDao;   //login için bu Dao interface ve classından getAll,getEmail ve getPassword'u kullanacağız.
	
	public LoginManager(UserDao userDao, CheckService checkService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.emailService = emailService;
	}

	@Override
	public void register(User user) {
	
		if (!userDao.emailExist(user)) {
			System.out.println("Registration failed!\n"+ user.getEmail() + " This e-mail address has been used before. ");	
			return;
		}
		
		if(checkService.checkFirstName(user.getFirstName()))  
		{ 	
			System.out.println("Name verified!");
		}
		else {
			return;
		}
		
		if(checkService.checkLastName(user.getLastName())) {
			System.out.println("Lastname verified!");
		}
		else {
			return;
		}
		
		if(checkService.checkEmail(user.getEmail())) {
			System.out.println("E-mail verified!");	
		}
		else {
			return;
		}
		
		if(checkService.checkPassword(user.getPassword())) {
			System.out.println("Password verified!");	
		}
		else {
			return;
		}
		
		
		emailService.clickToVerify(user);  //Tüm doğrulamaları sağlayınca doğrulamak için tıkla
		emailService.sendVerifyEmail(user); //Doğrulama linkine tıkladıktan sonra doğrulama e-maili gönder.
		
		userDao.add(user);   //Tüm işlemleri geçtiği için sisteme kaydoldu
		System.out.println("Registration is successful. Welcome: "+ user.getFirstName() + "!"); 
	}

	@Override
	public void login(String email, String password) {  //Giriş için getEmail ve getPassword kullandık.
				
		for(User user:userDao.getAll()) {
			if(email== user.getEmail() && password==user.getPassword()) {
				System.out.println("Login successful");
				return;
			}
			System.out.println("Wrong entry. Try again.");
		}
	}

	
}

