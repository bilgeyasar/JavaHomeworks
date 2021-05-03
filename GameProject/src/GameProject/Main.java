package GameProject;

import Concrete.GameManager;
import Abstract.ValidationCheckService;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.ValidationCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game1= new Game(1,"Asphalt 8 ",10000);
		Game game2= new Game(2,"Sims ",20000);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		gameManager.updateGame(game1);
		
		Gamer gamer1=new Gamer();
		gamer1.setBirthYear(1997);
		gamer1.setGamerId(3);
		gamer1.setNationalityId("12345678900");  //11 haneli olduğundan validation'ı sağladı.
		gamer1.setNickName("Bilge");
		
		GamerManager gamerManager= new GamerManager(new ValidationCheckManager());
		gamerManager.registration(gamer1);
		gamerManager.updateInfo(gamer1);
		
		Campaign campaign1= new Campaign(50,10000); //%50 indirimli kampanya
		Campaign campaign2= new Campaign(25,20000); //%25 indirimli kampanya
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.addCampaign(campaign1, game1);  //game1 artık campaign1 kampanyasını içeriyor.
		
		SaleManager saleManager=new SaleManager();
		saleManager.saleWithCampaign(game1, gamer1, campaign1);  //campaign1'daki fiyatın %50 indirimli halini verecek
		saleManager.saleWithoutCampaign(game2, gamer1, campaign2); //campaign2'deki fiyatın indirimsiz halini verecek
		
	}
}
