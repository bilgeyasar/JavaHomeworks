package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Game game) {
		System.out.println("%"+campaign.getDiscountRate() + " discount added to the game: " + game.getGameName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign, Game game) {
		System.out.println("Campagne is over");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Game game) {
		System.out.println("%"+campaign.getDiscountRate() + " discount updated of the game: " + game.getGameName());
	}

}
