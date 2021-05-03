package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	//Hem Starbucks hem de Nero save metodunu kullanacağı için class yazdık.

	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to Database: " + customer.getFirstName() );
	}

}
