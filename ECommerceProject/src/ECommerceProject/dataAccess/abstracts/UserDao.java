package ECommerceProject.dataAccess.abstracts;

import java.util.List;

import ECommerceProject.entities.concretes.User;

public interface UserDao {

	void add(User user);  //User'ı database'e ekleme
	void delete(User user);  //User'ı database'den silme
	List<User> getAll();   //User listesini göster
	boolean emailExist(User user);  //UserDao'daki e-maillere ulaşıyor.Böylece daha önce kullanıp kullanılmadığına bakıyoruz.
}
