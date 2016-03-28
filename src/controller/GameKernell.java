package controller;

import model.GameBoard;
import view.MainFrame;

public class GameKernell {

    private GameBoard gameBoard;

    private WinnerHandler winnerHandler;

    private PlayersHandler playersHandler;

    private SetFigureHandler setFigureHandler;

    private MainFrame GameWiev;


    public void CreateGame(){

        gameBoard = new GameBoard();

        playersHandler = new PlayersHandler();

        winnerHandler = new WinnerHandler(gameBoard);

        setFigureHandler = new SetFigureHandler(gameBoard, winnerHandler, playersHandler);

        GameWiev = new MainFrame("XO GAME", setFigureHandler, playersHandler, gameBoard);

        winnerHandler.setMainFrame(GameWiev);

    }


}
