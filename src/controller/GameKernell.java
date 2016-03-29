package controller;

import model.GameBoard;
import view.MainFrame;

public class GameKernell {


    public void CreateGame(){

        GameBoard gameBoard = new GameBoard();

        PlayersHandler playersHandler = new PlayersHandler();

        WinnerHandler winnerHandler = new WinnerHandler(gameBoard, playersHandler);

        SetFigureHandler setFigureHandler = new SetFigureHandler(gameBoard, winnerHandler, playersHandler);

        MainFrame gameWiev = new MainFrame("XO GAME", setFigureHandler, playersHandler, gameBoard);

        winnerHandler.setMainFrame(gameWiev);

    }


}
