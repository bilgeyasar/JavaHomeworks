package Concrete;

import Abstract.GamerService;
import Abstract.ValidationCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	//neye bağımlıysak onun private değişkenini yapıyoruz
	
	private ValidationCheckService validationCheckService;
	
	public GamerManager(ValidationCheckService validationCheckService) {
		super();
		this.validationCheckService = validationCheckService;
	}

	@Override
	public void registration(Gamer gamer) {
		if(validationCheckService.checkifValidate(gamer)) {
			System.out.println("Successfully registered! Welcome: " + gamer.getNickName());
		}
		else {
			System.out.println("Not a valid gamer.");
		}
		
		
	}

	@Override
	public void updateInfo(Gamer gamer) {
		if(validationCheckService.checkifValidate(gamer)) {
			System.out.println("Successfully updated! Welcome again: " + gamer.getNickName());
		}
		else {
			System.out.println("Not a valid gamer.");
		}
		
	}

	@Override
	public void deleteInfo(Gamer gamer) {
		System.out.println("Successfully deleted! Bye: " + gamer.getNickName());
		
	}

}
