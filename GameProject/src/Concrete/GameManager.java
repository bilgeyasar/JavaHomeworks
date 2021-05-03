package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println("Game added!\nGame name: " + game.getGameName()+ "Game Price: " + game.getGamePrice()
		+ " Game Id: " + game.getId());
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Game: " + game.getGameName() + " updated!");
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Game: " + game.getGameName() + " deleted!");
		
	}

}
