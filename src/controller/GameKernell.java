package controller;

import model.Board;
import model.Figure;
import model.Player;
import java.awt.*;

public class GameKernell {
    private Board gameBoard = new Board();
    private Figure[][] GameField = gameBoard.getGameField();
    private CheckWinnerHandler WinnerHandler = new CheckWinnerHandler(GameField);
    private Player playerX = new Player("Sasha", Figure.X);
    private Player playerO = new Player("Anna", Figure.O);
    private Player DefaultPlayer = playerX;
    private Player nextPlayer = DefaultPlayer;

    public void setFigureToTheField(Point coordinate, Player player) {
        if (player.equals(playerO)) {
            if (GameField[(int) coordinate.getX()][(int) coordinate.getY()] == null) {
                GameField[(int) coordinate.getX()][(int) coordinate.getY()] = player.getFigure();
                checkWinner();
                nextPlayer = playerX;
            }
        } else if (player.equals(playerX)) {
            if (GameField[(int) coordinate.getX()][(int) coordinate.getY()] == null) {
                GameField[(int) coordinate.getX()][(int) coordinate.getY()] = player.getFigure();
                checkWinner();
                nextPlayer = playerO;
            }
        }
    }

    public void showGameField() {
        for (int i = 0; i < GameField.length; i++) {
            System.out.println("");
            System.out.println();
            for (int j = 0; j < GameField[0].length; j++) {
                System.out.print(GameField[i][j] + "|");
            }
        }
    }

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public void checkWinner() {
        WinnerHandler.checkWinner();
//    showGameField();
    }

}
