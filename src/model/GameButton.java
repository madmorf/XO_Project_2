package model;


import controller.GameKernell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButton extends JButton {

    private Point coordinatePoint;

    private GameKernell gameKernell;

    public GameButton(Point coordinatePoint, GameKernell kernell) {
        this.coordinatePoint = coordinatePoint;
        this.gameKernell = kernell;
        configureButton();
        addListener();
    }

    private void addListener() {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeIcon();
                gameKernell.setFigureToTheField(getCoordinatePoint(), gameKernell.getNextPlayer());
            }
        });
    }

    private void configureButton() {
        setBorder(BorderFactory.createLoweredSoftBevelBorder());
        try {
            setIcon(new ImageIcon(getClass().getResource("Resources/Empty.png")));
        } catch (Exception e) {
        }
    }

    private void changeIcon() {
        if (gameKernell.getNextPlayer() == gameKernell.getPlayerX()) {
            try {
                setIcon(new ImageIcon(getClass().getResource("Resources/X.png")));
                setHorizontalTextPosition(AbstractButton.CENTER);
            } catch (Exception e) {
            }
        } else {
            try {
                setIcon(new ImageIcon(getClass().getResource("Resources/O.png")));
                setHorizontalTextPosition(AbstractButton.CENTER);
            } catch (Exception e) {
            }
        }

    }

    public Point getCoordinatePoint() {
        return coordinatePoint;
    }
}
