package controller;

import model.Figure;
import model.GameBoard;
import model.Player;

import java.awt.*;

public class SetFigureHandler {

    private Figure[][] GameField;

    private WinnerHandler winnerHandler;

    private PlayersHandler playersHandler;

    private Player PlayerO;

    private Player PlayerX;

    private Player NextPlayer;

    public SetFigureHandler(GameBoard gameBoard, WinnerHandler winnerHandler, PlayersHandler playersHandler) {
        GameField = gameBoard.getGameField();
        this.winnerHandler = winnerHandler;
        this.playersHandler = playersHandler;
        this.PlayerO = playersHandler.getPlayerO();
        this.PlayerX = playersHandler.getPlayerX();
        this.NextPlayer = playersHandler.getNextPlayer();
    }

    public void setFigureToTheField(Point coordinate, Player player) {
        if (player.equals(PlayerO)) {
            if (GameField[(int) coordinate.getX()][(int) coordinate.getY()] == null) {
                GameField[(int) coordinate.getX()][(int) coordinate.getY()] = player.getFigure();
                winnerHandler.setCurrentPlayer(PlayerO);
                winnerHandler.checkWinner();
                playersHandler.setNextPlayer(PlayerX);
            }
        } else if (player.equals(PlayerX)) {
            if (GameField[(int) coordinate.getX()][(int) coordinate.getY()] == null) {
                GameField[(int) coordinate.getX()][(int) coordinate.getY()] = player.getFigure();
                winnerHandler.setCurrentPlayer(PlayerX);
                winnerHandler.checkWinner();
                playersHandler.setNextPlayer(PlayerO);
            }
        }
    }
}
