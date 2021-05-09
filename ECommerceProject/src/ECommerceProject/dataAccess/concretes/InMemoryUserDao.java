package ECommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	//users içinde user'ları tutmamız gerekiyor.
	
	public List<User> users= new ArrayList<User>();
	
	@Override
	public void add(User user) {
    //İlk olarak add metodunu çağırmamız gerek ki parametreyle gelen user eklensin.
		
	this.users.add(user); //users listesine gönderilen user eklendi.
	System.out.println("Kullanıcı database'e eklendi. Kullanıcı: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Kullanıcı database'den silindi.Silinen kullanıcı: " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		
		return this.users; //users dönecek çünkü tüm kullanıcıları listelemek istiyoruz.
	}

	@Override
	public boolean emailExist(User user) {
		for (User person : users) 
			if (person.getEmail() == user.getEmail()) {
				return false;
			}				
		return true;
		
	}

	
		
	}

	
	

	

