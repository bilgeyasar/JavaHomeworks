package InterfaceAbstractDemo;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer1= new Customer(1,"Engin","Demiroğ", new Date(1985,2,11), "12345678901");
		Customer customer2=new Customer(2,"Bilge","Yaşar",new Date(1998, 7, 29),"55544433322");
		
		BaseCustomerManager neroCustomerManager=new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer2);
		
		

	}


}
