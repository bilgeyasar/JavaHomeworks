package ECommerceProject.core;


import ECommerceProject.GoogleRegister.GoogleManager;

import ECommerceProject.core.abstracts.GoogleService;


public class GoogleManagerAdapter implements GoogleService {

	//kendi sistemimizi implement ettik.
	
    //kendi şablonumuza uygun manager'ı çağırdık
		

	@Override
	public void registerToSystem() {
		
		
		GoogleManager googleManager=new GoogleManager();
		googleManager.register();
			
	}
}
	
	

