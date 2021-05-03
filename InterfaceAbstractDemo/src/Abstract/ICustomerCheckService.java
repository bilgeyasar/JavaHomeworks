package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);
}
