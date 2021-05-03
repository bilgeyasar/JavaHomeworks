package Abstract;

import Entities.Customer;

public interface ICustomerService {

	void save(Customer customer) ; //iki firma da müşterileri kayıveri tabanına kaydetmek istediği için.
	//Yani bütün müşterilerimizde bu yapı söz konusu. 
}
