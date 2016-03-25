package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {
    private Point coordinatePoint;
    private Boolean buttonIsEmty;

    public Button(Point coordinatePoint) {
        this.coordinatePoint = coordinatePoint;
        setText(coordinatePoint.toString());
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void setButtonIsEmty(Boolean buttonIsEmty) {
        this.buttonIsEmty = buttonIsEmty;
    }

    public Boolean getButtonIsEmty() {
        return buttonIsEmty;
    }

    public Point getCoordinatePoint() {
        return coordinatePoint;
    }
}
