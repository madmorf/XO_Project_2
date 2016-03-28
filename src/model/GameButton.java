package model;

import controller.PlayersHandler;
import controller.SetFigureHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButton extends JButton {

    private Point coordinatePoint;
    private SetFigureHandler setFigureHandler;
    private PlayersHandler playersHandler;
    private Figure[][] GameField;
    private IconImages images = new IconImages();

    public GameButton(Point coordinatePoint, SetFigureHandler setFigureHandler,
                      PlayersHandler playersHandler, GameBoard gameBoard) {
        this.GameField = gameBoard.getGameField();
        this.coordinatePoint = coordinatePoint;
        this.setFigureHandler = setFigureHandler;
        this.playersHandler = playersHandler;
        configureButton();
        addListener();
    }

    private void addListener() {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeIcon();
                setFigureHandler.setFigureToTheField(getCoordinatePoint(), playersHandler.getNextPlayer());
            }
        });
    }

    private void configureButton() {
        setBorder(BorderFactory.createLoweredSoftBevelBorder());
        setIcon(new ImageIcon(images.getEmpty()));
    }

    private void changeIcon() {
        if (GameField[(int) coordinatePoint.getX()][(int) coordinatePoint.getY()] == null){
            if (playersHandler.getNextPlayer() == playersHandler.getPlayerX()) {
                    setIcon(new ImageIcon(images.getX()));
                    setHorizontalTextPosition(AbstractButton.CENTER);
            } else {
                    setIcon(new ImageIcon(images.getO()));
                    setHorizontalTextPosition(AbstractButton.CENTER);
            }
        }

    }

    public Point getCoordinatePoint() {
        return coordinatePoint;
    }
}
