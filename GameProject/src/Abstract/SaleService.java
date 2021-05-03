package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {

	void saleWithCampaign(Game game, Gamer gamer,Campaign campaign);
	void saleWithoutCampaign(Game game, Gamer gamer,Campaign campaign);
}
