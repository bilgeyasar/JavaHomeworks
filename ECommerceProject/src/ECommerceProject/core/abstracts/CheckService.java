package ECommerceProject.core.abstracts;


public interface CheckService {
	
	boolean checkPassword(String password);   //Parola en az 6 karakterden oluşmalıdır.
	boolean checkEmail(String email);    //E-posta alanı e-posta formatında olmalıdır. (Regex ile yapınız. Araştırma konusu)
	boolean checkFirstName(String firstName);    //Ad ve soyad en az iki karakterden oluşmalıdır.
	boolean checkLastName(String lastName);     //Ad ve soyad en az iki karakterden oluşmalıdır.

	
}
