package Abstract;

import Entities.Gamer;

public interface GamerService {

	void registration(Gamer gamer);
	void updateInfo(Gamer gamer);
	void deleteInfo(Gamer gamer);
}
