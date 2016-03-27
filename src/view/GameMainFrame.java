package view;

import controller.GameKernell;
import model.*;

import javax.swing.*;
import java.awt.*;

public class GameMainFrame extends JFrame {

    private Toolkit toolkit = Toolkit.getDefaultToolkit();

    private GameKernell gameKernell = new GameKernell();

    public GameMainFrame(String title) {
        setTitle(title);
        configure();
        addButtons();
    }

    private void configure() {
        setResizable(true);
        setSize(new Dimension(400,400));
        putFrameInTheCenterOfTheScreen();
        setLayout(new GridLayout(GameBoard.getFieldHeight(), GameBoard.getFieldWidth()));
    }

    private void putFrameInTheCenterOfTheScreen() {
        Dimension screenSize = toolkit.getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
    }

    private void addButtons(){
        for (int i = 0; i < GameBoard.getFieldHeight(); i++){
            for (int j = 0; j < GameBoard.getFieldWidth(); j++){
                add(new GameButton(new Point(i,j), gameKernell));

            }
        }
    }

}
