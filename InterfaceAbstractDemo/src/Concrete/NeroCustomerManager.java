package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	ICustomerCheckService customerCheckService;

	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
		
	}
	
@Override
public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Nero person");  //Nero için çalışmasını göstermek amacıyla yazıldı.
		}
		else {
			System.out.println("Not a valid person.");
		}
	}
	
	
}
