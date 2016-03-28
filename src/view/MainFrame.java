package view;

import controller.PlayersHandler;
import controller.SetFigureHandler;
import model.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private Toolkit toolkit = Toolkit.getDefaultToolkit();

    private SetFigureHandler setFigureHandler;

    private PlayersHandler playersHandler;

    private GameBoard gameBoard;

    public MainFrame(String title, SetFigureHandler setFigureHandler, PlayersHandler playersHandler, GameBoard gameBoard) {
        this.gameBoard = gameBoard;
        this.setFigureHandler = setFigureHandler;
        this.playersHandler = playersHandler;
        setTitle(title);
        configure();
        addButtons();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void configure() {
        setResizable(true);
        setSize(new Dimension(400, 400));
        putFrameInTheCenterOfTheScreen();
        setLayout(new GridLayout(GameBoard.getFieldHeight(), GameBoard.getFieldWidth()));
    }

    private void putFrameInTheCenterOfTheScreen() {
        Dimension screenSize = toolkit.getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
    }

    private void addButtons() {
        for (int i = 0; i < GameBoard.getFieldHeight(); i++) {
            for (int j = 0; j < GameBoard.getFieldWidth(); j++) {
                add(new GameButton(new Point(i, j), setFigureHandler, playersHandler, gameBoard));
            }
        }
    }

    public void rebuild(){
        addButtons();
    }
}
