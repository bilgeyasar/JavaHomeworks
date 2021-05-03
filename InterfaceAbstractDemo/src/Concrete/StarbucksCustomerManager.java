package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerCheckService;
	
	
public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

@Override
public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Calidation successful.");
			System.out.println("Starbucks person");   //Nero için çalışmasını göstermek amacıyla yazıldı.
		}
		else {
			System.out.println("Not a valid person.");
		}
	}





}
