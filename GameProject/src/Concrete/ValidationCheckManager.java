package Concrete;

import Abstract.ValidationCheckService;
import Entities.Gamer;

public class ValidationCheckManager implements ValidationCheckService {
	
	@Override
	public boolean checkifValidate(Gamer gamer) {
		
		int nationalityIdLength = gamer.getNationalityId().length();
		if(nationalityIdLength==11) {
			System.out.println("Validation successfull!");	
			return true;
		}
		
		else {
			System.out.println("Please enter the correct informations.");
			
		}
		
		return false;
	}
	
	

}
