package controller;

import model.Figure;
import model.Player;

public class PlayersHandler {

    private Player PlayerX = new Player("Sasha", Figure.X);

    private Player PlayerO = new Player("Ann", Figure.O);

    private final Player DEFAULT_PLAYER  = PlayerX;

    private Player NextPlayer = DEFAULT_PLAYER;

//    public void createPlayerX(String name, Figure figure){
//        PlayerX = new Player(name, figure);
//    }
//
//    public void createPlayerO(String name, Figure figure){
//        PlayerO = new Player(name, figure);
//    }

    public Player getPlayerX() {
        return PlayerX;
    }

    public Player getPlayerO() {
        return PlayerO;
    }

    public Player getNextPlayer() {
        return NextPlayer;
    }

    public void setNextPlayer(Player nextPlayer) {
        NextPlayer = nextPlayer;
    }
}
