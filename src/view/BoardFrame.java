package view;

import controller.GameKernell;
import model.*;

import javax.swing.*;
import java.awt.*;

public class BoardFrame extends JFrame {
    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private GameKernell gameGameKernell = new GameKernell();

    public BoardFrame(String title) {
        setTitle(title);
        configure();
        addButtons();
    }

    private void configure() {
        setResizable(true);
        setSize(new Dimension(400,400));
        putFrameInTheCenterOfTheScreen();
        setLayout(new GridLayout(Board.getFieldHeight(),Board.getFieldWidth()));
    }

    private void putFrameInTheCenterOfTheScreen() {
        Dimension screenSize = toolkit.getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
    }

    private void addButtons(){
        for (int i = 0; i < Board.getFieldHeight(); i++){
            for (int j = 0; j < Board.getFieldWidth(); j++){
                add(new model.Button(new Point(i,j), gameGameKernell));

            }
        }
    }

}
