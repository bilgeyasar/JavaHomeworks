package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Id number: " + gamer.getGamerId() + " bought game: " + game.getGameName() +
				" with discounted price " + campaign.getUnitPriceAfterDiscount() );
		
	}

	@Override
	public void saleWithoutCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Id number: " + gamer.getGamerId() + " bought game: " + game.getGameName() +
				" without discounted price " + campaign.getUnitPrice() );
		
	}

}
