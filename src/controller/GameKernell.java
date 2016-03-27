package controller;

import model.GameBoard;
import model.Figure;
import model.Player;
import java.awt.*;

public class GameKernell {

    private GameBoard gameBoard = new GameBoard();

    private Figure[][] GameField = gameBoard.getGameField();

    private Player PlayerX = new Player("Sasha", Figure.X);

    private Player PlayerO = new Player("Anna", Figure.O);

    private final Player DEFAULT_PLAYER = PlayerX;

    private Player NextPlayer = DEFAULT_PLAYER;

    private WinnerHandler winnerHandler = new WinnerHandler(GameField);

    public void setFigureToTheField(Point coordinate, Player player) {
        if (player.equals(PlayerO)) {
            if (GameField[(int) coordinate.getX()][(int) coordinate.getY()] == null) {
                GameField[(int) coordinate.getX()][(int) coordinate.getY()] = player.getFigure();
                winnerHandler.setCurrentPlayer(PlayerO);
                winnerHandler.checkWinner();
                NextPlayer = PlayerX;
            }
        } else if (player.equals(PlayerX)) {
            if (GameField[(int) coordinate.getX()][(int) coordinate.getY()] == null) {
                GameField[(int) coordinate.getX()][(int) coordinate.getY()] = player.getFigure();
                winnerHandler.setCurrentPlayer(PlayerX);
                winnerHandler.checkWinner();
                NextPlayer = PlayerO;
            }
        }
    }

    public Player getNextPlayer() {
        return NextPlayer;
    }
}
